import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Birim {
    public int Id;
    public int BirimTipId;
    public String BirimAdi;
    /* Veritabanı için nesne */
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    public Birim() {
          baglanti=SqlBaglanti.baglanti();
    }
    
    public Birim[] BirimleriGetir(int id){    
    String kullanicisorgu ="SELECT * FROM BIRIM WHERE ID= ?";
    if(id==0){
    kullanicisorgu ="SELECT * FROM BIRIM";
    }
    try {
        preparedStatement=baglanti.prepareStatement(kullanicisorgu);//kullanicisorgusunu hazırla
        if(id!=0){
            preparedStatement.setInt(1, id); // where ID=? dediğimiz için ? işareti yerine gelecek değer
        }
        resultSet=preparedStatement.executeQuery();//sorguyu çalıştır  
        int size =0;
        if (resultSet != null){
            resultSet.last();    // moves cursor to the last row
            size = resultSet.getRow(); // get row id 
        }
        Birim[] b = new Birim[size];
        int i = 0;
            if(resultSet.next()){ // gelen sonucta değer varsa bu bloga gir
                b[i].Id = resultSet.getInt("ID"); // "ID" veritabanı tablosundaki alanlar
                b[i].BirimTipId = resultSet.getInt("BIRIM_TIP_ID");
                b[i].BirimAdi = resultSet.getString("BIRIMADI");
                i++;          
            }else{
            
            }     
           return b;
    }catch (Exception e) {
        System.err.println("hata: "+e);
    }
    return null;
    }
    
    public myTableModel BirimleriGetirTableModel(int id){    
    String kullanicisorgu ="SELECT * FROM BIRIM WHERE ID= ?";
    if(id==0){
    kullanicisorgu ="SELECT * FROM BIRIM";
    }
        try {
            preparedStatement=baglanti.prepareStatement(kullanicisorgu);//kullanicisorgusunu hazırla
            if(id!=0){
                preparedStatement.setInt(1, id);// where ID=? dediğimiz için ? işareti yerine gelecek değer
            }           
            resultSet=preparedStatement.executeQuery();  //sorguyu çalıştır            
            myTableModel model= new myTableModel(resultSet);
            return model;
        }catch (Exception e) {
            System.err.println("hata: "+e);
        }
        return null;
    }
    
    public boolean BirimSil(int id){
       try {               
            String silmeSorgusu = "DELETE FROM BIRIM WHERE BIRIM_ID = ?";                
            preparedStatement = baglanti.prepareStatement(silmeSorgusu);
            preparedStatement.setInt(1, id);                
            preparedStatement.execute(); 
            return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);                
            }
       return false;
    }
    
     public boolean BirimGuncelle(int id, String birimAdi){
      try {
       String guncellemeSorgusu = "UPDATE BIRIM SET BIRIMADI=? WHERE ID="+id;     
       preparedStatement=baglanti.prepareStatement(guncellemeSorgusu);       
       preparedStatement.setString(1, birimAdi);
       preparedStatement.executeUpdate();     
       return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA : Kaydı güncelleme sırasında hata meydana geldi." , "Güncelleme işlemi gerçekleştirilemedi", JOptionPane.ERROR_MESSAGE);
           System.out.println("hata: "+e);
        }
      return false;
    }  
}
