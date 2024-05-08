/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg211220039_gurkan_soyturk10;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gurkan
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(this);
        Component[] c = this.getContentPane().getComponents();
        for(int i=0; i<c.length;i++){
            if(c[i] instanceof JButton){
                JButton tmp2 = (JButton) c[i];
                tmp2.setBackground(Color.white);
                tmp2.setForeground(Color.black);
            }
            else if(c[i] instanceof JPanel){
                JPanel tmp3 = (JPanel) c[i];
                tmp3.setBackground(Color.WHITE);
                
            }
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        girisyapBTN = new javax.swing.JButton();
        kayıtolBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jMenuItem1.setText("Şifremi Unuttum");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jDialog1.setMinimumSize(new java.awt.Dimension(302, 162));

        jLabel7.setText("Yeni Şifreniz :");

        jLabel8.setText("Yeni Şifreniz (tekrar) :");

        jButton1.setText("Şifremi Değiştir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField3)
                            .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("211220039");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Öğrenci Bilgi Sistemi Giriş Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setComponentPopupMenu(jPopupMenu1);

        jLabel3.setText("Kullanıcı Adınız :");

        jLabel4.setText("Şifreniz :");

        girisyapBTN.setText("Giriş Yap");
        girisyapBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisyapBTNActionPerformed(evt);
            }
        });

        kayıtolBTN.setText("Kayıt Ol");
        kayıtolBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayıtolBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("· Hesabınız yoksa bilgilerinizi girip \"Kayıt Ol\" butonuna tıklayarak kayıt olabilirsiniz.");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setText("· Şifrenizi unuttuysanız panele sağ tıklayıp \"Şifremi Unuttum\" a basarak değiştirebilirsiniz.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(girisyapBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kayıtolBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisyapBTN))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayıtolBTN))
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)
                        .addGap(179, 179, 179))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayıtolBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayıtolBTNActionPerformed
        Connection con = myAccessConnection();
        if(con==null)
            return;
        
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ad giriniz !","HATA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jPasswordField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Şifre giriniz !","HATA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String ad;
            String sifre;
            
            ad=jTextField1.getText();
            sifre=jPasswordField1.getText();
            String kontrol = "SELECT * FROM TABLO WHERE USERNAME = '"+ad+"'";
            
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(kontrol);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Girilen kullanıcı adı sistemde mevcut !","HATA",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            
            stmt.execute("INSERT INTO TABLO(USERNAME,PASSWORD) VALUES('"+ad+"','"+sifre+"')");
            JOptionPane.showMessageDialog(this, "Kayıt Olundu !","BİLGİ" , JOptionPane.INFORMATION_MESSAGE);
            
            stmt.close();
            con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Bağlantı hatası..", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kayıtolBTNActionPerformed

    private void girisyapBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisyapBTNActionPerformed
        try {
            String ad = jTextField1.getText();
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM TABLO WHERE USERNAME = '"+ad+"'");
            
            if(rs.next()){
                String sifre = rs.getString("PASSWORD");
                if(jPasswordField1.getText().equals(sifre)){
                    JOptionPane.showMessageDialog(this, "Giriş başarılı !","BAŞARILI",JOptionPane.INFORMATION_MESSAGE);
                    Gurkan_10 system = new Gurkan_10();
                    system.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Şifre yanlış tekrar deneyin !","HATA",JOptionPane.ERROR_MESSAGE);
                    jPasswordField1.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Sistemde böyle bir kullanıcı adı bulunamadı, tekrar deneyiniz !","HATA",JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                jPasswordField1.setText("");
            }
            
            rs.close();
            stmt.close();
            con.close();

            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Bağlantı hatası..", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_girisyapBTNActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jDialog1.setVisible(true);
        jDialog1.getContentPane().setBackground(Color.WHITE);
        jDialog1.setTitle("Şifre Yenileme");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            
            String newpass = jPasswordField3.getText();
            String newpasscontrol = jPasswordField4.getText();
            String kullanici_adi = jTextField1.getText();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM TABLO WHERE USERNAME = '"+kullanici_adi+"'");
            
            if(rs.next()){ //kullanici adi dogruysa çalışır
                if(newpasscontrol.equals(newpass)){
                    jLabel10.setText("İki şifrede aynı devam edebilirsiniz.");
                    jLabel10.setForeground(Color.green);
                    stmt.executeUpdate("UPDATE TABLO SET PASSWORD = '"+newpass+"' WHERE USERNAME= '"+kullanici_adi+"'");
                    JOptionPane.showMessageDialog(this, "Şifre değiştirildi !","BAŞARILI",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    jLabel10.setText("İki şifre farklı değiştirip tekrar deneyin !");
                    jLabel10.setForeground(Color.red);    
                    jPasswordField3.setText("");
                    jPasswordField4.setText("");
                }
                

            }
            else{
                JOptionPane.showMessageDialog(this, "Sistemde böyle bir kullanıcı adı bulunamadı, tekrar deneyiniz !","HATA",JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"HATA",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public Connection myAccessConnection()
    {
        Connection con;
        con = null;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Bağlantı nesnesi
            String strdatabase = "jdbc:ucanaccess://src/pkg211220039_gurkan_soyturk10/veritabanilogin.accdb"; //veritabanının ismi
            con = DriverManager.getConnection(strdatabase); //Access-java bağlantısnı sağlayan jdbc sürücüsü ile bağlantı oluşturuluyor
            System.out.println(con);
            
        }
        catch(Exception e)
        {        
            System.out.println("bağlantı hatası");
            JOptionPane.showMessageDialog(null, e.toString(), "Bağlantı Hatası", JOptionPane.ERROR_MESSAGE);
        }
		return con;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisyapBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kayıtolBTN;
    // End of variables declaration//GEN-END:variables
}
