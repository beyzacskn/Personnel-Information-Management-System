import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AnaPanel extends javax.swing.JFrame {
Object[] dugme ={"Tamam"};
    public AnaPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKisiler = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaas = new javax.swing.JTextField();
        txtUnvan = new javax.swing.JTextField();
        btnekle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDtarih = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        comboKurum = new javax.swing.JComboBox<>();
        rdnbtnK = new javax.swing.JRadioButton();
        rdnbtnE = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnKsil = new javax.swing.JButton();
        btnbirim = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ETÜ - Ana Panel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Doğum Tarihi:");

        jLabel2.setText("Cinsiyet:");

        jLabel3.setText("Adı :");

        txtAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdActionPerformed(evt);
            }
        });

        jTableKisiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Adı", "Soyadı", "Kimlik", "Doğum Tarihi", "Cinsiyet", "Maas", "Unvan"
            }
        ));
        jTableKisiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableKisilerMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKisiler);

        jLabel4.setText("Maas:");

        jLabel5.setText("Unvan:");

        btnekle.setText("Kullanıcı Ekle");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });

        jLabel6.setText("Kurum:");

        txtDtarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtarihActionPerformed(evt);
            }
        });

        jLabel7.setText("Soyadı:");

        comboKurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKurumActionPerformed(evt);
            }
        });

        rdnbtnK.setText("Kadın");

        rdnbtnE.setText("Erkek");

        jLabel8.setText("Kullanıcı Parola:");

        btnKsil.setText("Kullanıcı Sil");
        btnKsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKsilActionPerformed(evt);
            }
        });

        btnbirim.setText("BİRİM TABLOSU");
        btnbirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbirimActionPerformed(evt);
            }
        });

        jMenu1.setText("Personel Bilgileri");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Memur İşlemleri");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(rdnbtnK)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdnbtnE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUnvan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboKurum, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDtarih, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKsil)
                            .addComponent(btnekle)
                            .addComponent(btnbirim))
                        .addGap(82, 82, 82)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboKurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rdnbtnK)
                            .addComponent(rdnbtnE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDtarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnekle))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnKsil)))))
                .addGap(12, 12, 12)
                .addComponent(btnbirim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection baglanti = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
            baglanti=SqlBaglanti.baglanti();
            kisilerTablosunuDoldur();
           
            String[] array = null;
            Statement st = baglanti.createStatement();
            ResultSet rs = st.executeQuery("Select count(*) from KURUM");
            
            if(rs.next())
                array = new String[rs.getInt(1)];
            
            st = baglanti.createStatement();
            rs = st.executeQuery("Select KurumAdi from KURUM");
            
            int i = 0;
            while(rs.next()){
                array[i] = rs.getString(1);
                i++;
            }
            
            comboKurum.setModel(new javax.swing.DefaultComboBoxModel<>(array));
        } catch (SQLException ex) {
            Logger.getLogger(AnaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTableKisilerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKisilerMousePressed
    if(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 0)!=null){
        txtAd.setText(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 0).toString());
    }
    if(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 1)!=null){
        txtSoyad.setText(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 1).toString());
    }
    
    if(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 2)!=null){
        txtDtarih.setText(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 3).toString());   
    }
    /*
    if(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 3)!=null){
        txtCinsiyet.setText(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 4).toString());   
    }*/
    if(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 4)!=null){
        txtMaas.setText(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 5).toString());   
    }
    if(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 5)!=null){
        txtUnvan.setText(jTableKisiler.getValueAt(jTableKisiler.getSelectedRow(), 6).toString());
    }   
    }//GEN-LAST:event_jTableKisilerMousePressed

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
    try {
        KullaniciKaydet();
    } catch (SQLException ex) {
        Logger.getLogger(AnaPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnekleActionPerformed

    private void txtDtarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtarihActionPerformed

    private void comboKurumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKurumActionPerformed
       
    }//GEN-LAST:event_comboKurumActionPerformed

    private void txtAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdActionPerformed

    private void btnKsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKsilActionPerformed
        KullaniciSil();
    }//GEN-LAST:event_btnKsilActionPerformed

    private void btnbirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbirimActionPerformed
        this.setVisible(false);
        BirimFrame frame = new BirimFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_btnbirimActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKsil;
    private javax.swing.JButton btnbirim;
    private javax.swing.JButton btnekle;
    private javax.swing.JComboBox<String> comboKurum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKisiler;
    private javax.swing.JRadioButton rdnbtnE;
    private javax.swing.JRadioButton rdnbtnK;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtDtarih;
    private javax.swing.JTextField txtMaas;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtUnvan;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    private void kisilerTablosunuDoldur() {
        try {
            String personelSorgu ="SELECT*FROM KULLANICI";
            preparedStatement=baglanti.prepareStatement(personelSorgu);
            resultSet=preparedStatement.executeQuery();
            myTableModel model= new myTableModel(resultSet);
                jTableKisiler.setModel(model);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE); 
            }    
    }
    public void KullaniciKaydet() throws SQLException{ /*KULLANICI_CINSIYETI*/
        try{
        String sql= "INSERT INTO KULLANICI (PAROLA,KULLANICI_ADI,KULLANICI_SOYADI,KULLANICI_DTARIHI,KULLANICI_MAAS,KULLANICI_UNVAN) VALUES(?,?,?,?,?,?)";
        preparedStatement=baglanti.prepareStatement(sql);
        preparedStatement.setString(1, txtpass.getText());
        preparedStatement.setString(2, txtAd.getText());
        preparedStatement.setString(3, txtSoyad.getText());    
        preparedStatement.setString(4, txtDtarih.getText());
        preparedStatement.setString(5, txtMaas.getText());
        preparedStatement.setString(6, txtUnvan.getText());
        preparedStatement.execute(); //sorguyu çalıştır
        JOptionPane.showOptionDialog(rootPane, "Yeni Kullanıcı eklendi", "Kayıt Başarılı", WIDTH, WIDTH, null, dugme, rootPane);
        btnekle.setEnabled(false);
        txtAd.setText(null);
        txtSoyad.setText(null);
        txtDtarih.setText(null);
        txtpass.setText(null);
        txtMaas.setText(null);
        txtUnvan.setText(null);
        }catch (Exception e){
            JOptionPane.showOptionDialog(rootPane, "Kayıt Eklenemedi:"+e.getMessage(), "Kullanıcı",WIDTH,JOptionPane.ERROR_MESSAGE,null,dugme,rootPane);
        }  
    }
    private void KullaniciSil() {
        try {               
            String silmeSorgusu = "DELETE FROM KULLANICI WHERE KULLANICI_ID = ?";                
            preparedStatement = baglanti.prepareStatement(silmeSorgusu);
            preparedStatement.setString(1, txtAd.getText());
            preparedStatement.execute(); //sorguyu çalıştır
            JOptionPane.showOptionDialog(rootPane, "Kullanıcı silindi", "işlem Başarılı", WIDTH, WIDTH, null, dugme, rootPane);
            btnKsil.setEnabled(false);
            txtAd.setText(null);
            txtSoyad.setText(null);
            txtDtarih.setText(null);
            txtpass.setText(null);
            txtMaas.setText(null);
            txtUnvan.setText(null);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HATA :" + e, "MESAJ", JOptionPane.ERROR_MESSAGE);                
            } 
    }   
}
