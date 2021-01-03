import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;


public class KullaniciGirisi {
    
    Object[] dugme ={"Tamam"};
    
    public String KullaniciAdi;
    private String Parola;
    public int kategoriId;
    public boolean sonuc;
    
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    SqlBaglanti con = new SqlBaglanti();

    public KullaniciGirisi() {
         baglanti=con.baglanti();
    }

    public String getKullanıcıAdi() {
        return KullaniciAdi;
    }

    public void setPersonelAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }
    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }
    
    public int KullaniciDogrula(String KullaniciAdi, String Parola){    
    String kullanicisorgu ="SELECT * FROM KULLANICI,KATEGORILER WHERE KULLANICI_ADI= ? AND PAROLA= ? AND KULLANICI.KATEGORI_ID = KATEGORILER.KATEGORI_ID ";
        try {
            preparedStatement=baglanti.prepareStatement(kullanicisorgu);
            preparedStatement.setString(1, KullaniciAdi);
            preparedStatement.setString(2, Parola);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int kID=Integer.parseInt(resultSet.getString("KATEGORI_ID"));
                System.out.println(kID);
                return kID;
            }
            else{
                   return -1;
            }
        } catch (Exception e) {
            System.err.println("hata: "+e);
        }
    return 0;
    }
}
