import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class KullaniciEkle extends javax.swing.JFrame {
Object[] dugme ={"Tamam"};

    public KullaniciEkle() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtParola = new javax.swing.JPasswordField();
        btnKaydet = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUnvan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtDtarih = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtCinsiyet = new javax.swing.JTextField();

        jButton2.setText("GİRİŞ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ETÜ BİLGİSAYAR MÜHENDİSLİĞİ TOPLULUĞU KULLANICI EKLE");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("PERSONEL BİLGİ YÖNETİM SİSTEMİ KULLANICI EKLE");

        jLabel2.setText("KULLANICI ADI:");

        jLabel3.setText("PAROLA:");

        btnKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_3.png"))); // NOI18N
        btnKaydet.setText("KAYDET");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit_3.png"))); // NOI18N
        btnCikis.setText("KAPAT");
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/01.png"))); // NOI18N

        jLabel5.setText("MAAS:");

        jLabel6.setText("UNVAN");

        jLabel7.setText("KULLANICI SOYADI:");

        jLabel8.setText("DOĞUM TARİHİ:");

        jLabel9.setText("CİNSİYET:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtParola, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtKullaniciAdi)
                                    .addComponent(txtSoyad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCinsiyet)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(35, 35, 35)
                                .addComponent(txtDtarih))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaas)
                                    .addComponent(txtUnvan))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
KullaniciKaydet();
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        //System.exit(0);
        this.setVisible(false);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
 baglanti=SqlBaglanti.baglanti();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            // select Look and Feel
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
            // start application    
               }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCinsiyet;
    private javax.swing.JPasswordField txtDtarih;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtMaas;
    private javax.swing.JPasswordField txtParola;
    private javax.swing.JPasswordField txtSoyad;
    private javax.swing.JTextField txtUnvan;
    // End of variables declaration//GEN-END:variables

public void GirisYap(String kulAdi, String parola){

    String kullanicisorgu ="SELECT * FROM KULLANICI WHERE KULLANICIADI= ? AND PAROLA= ?";
        try {
            preparedStatement=baglanti.prepareStatement(kullanicisorgu);
            preparedStatement.setString(1, txtKullaniciAdi.getText());
            preparedStatement.setString(2, txtParola.getText());
            resultSet=preparedStatement.executeQuery();          
            if(resultSet.next()){
                JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı ve parolası doğrulandı.", "Girişiniz Onaylandı", WIDTH, WIDTH, null, dugme, rootPane);
                this.setVisible(false);
                AnaPanel ana = new AnaPanel();
                ana.setVisible(rootPaneCheckingEnabled);
            }else{
            JOptionPane.showOptionDialog(rootPane, "Kullanıcı adı veya parolası geçersiz.", "Hata Meydana Geldi", WIDTH, JOptionPane.ERROR_MESSAGE, null, dugme, rootPane);                
            }
        } catch (Exception e) {
            System.err.println("hata: "+e);
        }  
} 
public void KullaniciKaydet() {
    try {
        if(txtKullaniciAdi.getText().equals("")){
            Object[] dugme1={"Tamam"};
            JOptionPane.showOptionDialog(rootPane, "HATA: Kullanıcı Adı alanı boş bırakılamaz.", "Kullanıcı",WIDTH,WIDTH,null,dugme1,rootPane);  
            return;
        }
        else if(txtParola.getText().equals("")){
            Object[] dugme1={"Tamam"};
            JOptionPane.showOptionDialog(rootPane, "HATA: Parola alanı boş bırakılamaz.", "Kullanıcı",WIDTH,WIDTH,null,dugme1,rootPane);  
            return;
        }  
        else if(txtMaas.getText().equals("")){
            JOptionPane.showOptionDialog(rootPane, "HATA: Email alanı boş bırakılamaz.", "Kullanıcı",WIDTH,WIDTH,null,dugme,rootPane);  
            return;
        }
        else if(txtUnvan.getText().equals("")){
            JOptionPane.showOptionDialog(rootPane, "HATA: Cep No alanı boş bırakılamaz.", "Kullanıcı",WIDTH,WIDTH,null,dugme,rootPane);  
            return;
        }
        else if(txtUnvan.getText().equals("")){           
            JOptionPane.showOptionDialog(rootPane, "HATA: Cep No alanı 11 karakterden  fazla olamaz.", "Kullanıcı",WIDTH,WIDTH,null,dugme,rootPane);  
            return;
        } 
        else{
            String sql= "INSERT INTO KULLANICI (PAROLA,KULLANICI_ADI,KULLANICI_SOYADI,KULLANICI_CINSIYETI,KULLANICI_DTARIHI,KULLANICI_MAAS,KULLANICI_UNVAN) VALUES(?,?,?,?,?,?,?)";
            preparedStatement=baglanti.prepareStatement(sql);
            preparedStatement.setString(1, txtParola.getText());
            preparedStatement.setString(2, txtKullaniciAdi.getText());
            preparedStatement.setString(3, txtMaas.getText());
            preparedStatement.setString(4, txtUnvan.getText());
            preparedStatement.execute(); //sorguyu çalıştır
            JOptionPane.showOptionDialog(rootPane, "Yeni Kullanıcı eklendi", "Kayıt Başarılı", WIDTH, WIDTH, null, dugme, rootPane);
            btnKaydet.setEnabled(false);
            txtKullaniciAdi.setText(null);
            txtParola.setText(null);
            txtMaas.setText(null);
            txtUnvan.setText(null);
        }
       }catch (Exception e){
            JOptionPane.showOptionDialog(rootPane, "Kayıt Eklenemedi:"+e.getMessage(), "Kullanıcı",WIDTH,JOptionPane.ERROR_MESSAGE,null,dugme,rootPane);
        }
    }

}
