
package pkg211220039_gurkan_soyturk10;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;



public class Gurkan_10 extends javax.swing.JFrame {

  
    public Gurkan_10() {
        initComponents();
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        tumverilerlisteleBTN = new javax.swing.JButton();
        gecenlerlisteleBTN = new javax.swing.JButton();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        silMENU = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        veriTabaninaYukleBTN = new javax.swing.JButton();
        ogrenciSilBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        veritabaniBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        acMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        kaydetMenu = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(525, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KIMLIK", "AD", "OGRNO", "SINIF", "NOT", "CINSIYET"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("Geçme Notu :");

        tumverilerlisteleBTN.setText("Tüm Verileri Listele");
        tumverilerlisteleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tumverilerlisteleBTNActionPerformed(evt);
            }
        });

        gecenlerlisteleBTN.setText("Geçenleri Listele");
        gecenlerlisteleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gecenlerlisteleBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(gecenlerlisteleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tumverilerlisteleBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tumverilerlisteleBTN)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gecenlerlisteleBTN)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        silMENU.setText("Sil");
        silMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silMENUActionPerformed(evt);
            }
        });
        jPopupMenu1.add(silMENU);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("211220039");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Öğrenci Bilgi Sistemi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Ad Soyad :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Öğrenci No :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Sınıf :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Not :");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Cinsiyet :");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Erkek");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Kadın");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addContainerGap())
        );

        veriTabaninaYukleBTN.setText("Girilen Verileri Veritabanına Yükle");
        veriTabaninaYukleBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veriTabaninaYukleBTNActionPerformed(evt);
            }
        });

        ogrenciSilBTN.setText("Öğrenci Sil");
        ogrenciSilBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrenciSilBTNActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("NOT: Öğrencinin ismini giriniz !");

        veritabaniBTN.setText("Veritabanı İncele");
        veritabaniBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veritabaniBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Karanlık Mod");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Dosya");

        acMenu.setText("Aç");
        acMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acMenuActionPerformed(evt);
            }
        });
        jMenu1.add(acMenu);
        jMenu1.add(jSeparator1);

        kaydetMenu.setText("Kaydet");
        kaydetMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetMenuActionPerformed(evt);
            }
        });
        jMenu1.add(kaydetMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(veritabaniBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jFormattedTextField2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1)
                                    .addComponent(jFormattedTextField1))
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ogrenciSilBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(veriTabaninaYukleBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(veriTabaninaYukleBTN)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciSilBTN)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(veritabaniBTN)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veriTabaninaYukleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veriTabaninaYukleBTNActionPerformed
        Connection con = myAccessConnection();
        if(con==null)
            return;
        
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Ad giriniz !","HATA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
            String not;
            String ad_soyad,ogr_no,sınıf,cinsiyet,strSQL;
            ad_soyad=jTextField1.getText();
            ogr_no=jFormattedTextField1.getText();
            sınıf=(String) jComboBox1.getSelectedItem();
            cinsiyet="";
            if(jRadioButton1.isSelected()){
                cinsiyet+=jRadioButton1.getText();
            }
            else if(jRadioButton2.isSelected()){
               cinsiyet+=jRadioButton2.getText();
            }
            not=(jFormattedTextField2.getText());
        
            strSQL="INSERT INTO KISILER(AD,OGRNO,SINIF,PUAN,CINSIYET) VALUES('"+ad_soyad+"','"+ogr_no+"','"+sınıf+"','"+not+"','"+cinsiyet+"')";
        
            Statement stmt;
            stmt=con.createStatement();
            stmt.execute(strSQL);
            
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(this, "Veriler Kaydedildi.","Mesaj",JOptionPane.INFORMATION_MESSAGE);
            
            jTextField1.setText("");
            jFormattedTextField1.setText("");
            jFormattedTextField2.setText("");
            jComboBox1.setSelectedIndex(0);
            jRadioButton1.setSelected(false); jRadioButton2.setSelected(false);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"HATA",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_veriTabaninaYukleBTNActionPerformed

    private void ogrenciSilBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrenciSilBTNActionPerformed
        Connection con = myAccessConnection();
        if(con==null)
            return;

        try {
            String ad_soyad,strSQL;
            ad_soyad=jTextField1.getText();
            if(ad_soyad.equals("")){ // ad girilmemisse
                JOptionPane.showMessageDialog(this, "Silmek icin AD girin.","HATA",JOptionPane.ERROR_MESSAGE);
            }
            else{
               strSQL="DELETE FROM KISILER WHERE AD='"+ad_soyad+"'";
               Statement stmt=con.createStatement();
               stmt.execute(strSQL);
               stmt.close();
               con.close();
               JOptionPane.showMessageDialog(this, "Veriler Kaydedildi.","Mesaj",JOptionPane.INFORMATION_MESSAGE);
               jTextField1.setText("");
               
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage(),"HATA",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ogrenciSilBTNActionPerformed

    private void acMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acMenuActionPerformed
        if(jFileChooser1.showOpenDialog(this) ==  JFileChooser.APPROVE_OPTION){
            try {
                FileReader fr= new FileReader(jFileChooser1.getSelectedFile().getAbsolutePath());
                BufferedReader br = new BufferedReader(fr);
                String line =br.readLine();
                String[] parcalar;
                while(line!=null){
                    parcalar=line.split("//");
                    switch(parcalar[0]){
                        case "ad":
                            jTextField1.setText(parcalar[1]);
                            break;
                        case "ogr_no":
                            jFormattedTextField1.setText(parcalar[1]);
                            break;
                        case "sinif":
                            jComboBox1.setSelectedIndex(Integer.parseInt(parcalar[1]));
                            break;
                        case "not":
                            jFormattedTextField2.setText(parcalar[1]);
                            break;
                        case "cinsiyet":
                            jRadioButton1.setSelected(false);
                            jRadioButton2.setSelected(false);
                            if(parcalar[1].contains("Erkek")){
                                jRadioButton1.setSelected(true);
                            }
                            else if(parcalar[1].contains("Kadın")){
                                jRadioButton2.setSelected(true);
                            }
                            break;  
                    }
                    line=br.readLine();
                }
                br.close();
                JOptionPane.showMessageDialog(this, "Dosya başarıyla okundu !");
            } catch (IOException ex) {
                Logger.getLogger(Gurkan_10.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_acMenuActionPerformed

    private void kaydetMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetMenuActionPerformed
        if(jFileChooser1.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
            try {
                FileWriter fw = new FileWriter(jFileChooser1.getSelectedFile().getAbsolutePath());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("ad//"+jTextField1.getText()+"\n");
                bw.write("ogr_no//"+jFormattedTextField1.getText()+"\n");
                bw.write("sinif//"+jComboBox1.getSelectedIndex()+"\n");
                bw.write("not//"+jFormattedTextField2.getText()+"\n");
                if(jRadioButton1.isSelected()){
                    bw.write("cinsiyet//"+jRadioButton1.getText()+"\n");
                }
                else if(jRadioButton2.isSelected()){
                    bw.write("cinsiyet//"+jRadioButton2.getText()+"\n");
                }
                bw.close();
                JOptionPane.showMessageDialog(this, "Bilgiler başarıyla kaydedildi !");
                
                jTextField1.setText("");
                jFormattedTextField1.setText("");
                jFormattedTextField2.setText("");
                jComboBox1.setSelectedIndex(0);
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
            
            } catch (IOException ex) {
                Logger.getLogger(Gurkan_10.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_kaydetMenuActionPerformed

    private void veritabaniBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veritabaniBTNActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_veritabaniBTNActionPerformed

    private void tumverilerlisteleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tumverilerlisteleBTNActionPerformed
        
        try {
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS kisisayi FROM KISILER");
            rs.next();
            
            int satirsayisi = rs.getInt("kisisayi");
            
            Object[][] liste = new Object[satirsayisi][6];
            rs = stmt.executeQuery("SELECT * FROM KISILER");
            stmt.close();
            con.close();
            
            int sayac = 0;
            while(rs.next()){
                liste[sayac][0] = sayac + 1;
                liste[sayac][1] = rs.getString("AD");
                liste[sayac][2] = rs.getString("OGRNO");
                liste[sayac][3] = rs.getString("SINIF");
                liste[sayac][4] = rs.getInt("PUAN");
                liste[sayac][5] = rs.getString("CINSIYET");
                sayac++;
            }
            String[] basliklar = {"S.NO","Ad Soyad","Öğrenci No","Sınıf","Not","Cinsiyet"};
            jTable1.setModel(new DefaultTableModel(liste,basliklar));
            
            
            
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Bağlantı hatası", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_tumverilerlisteleBTNActionPerformed

    private void gecenlerlisteleBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gecenlerlisteleBTNActionPerformed
        
        try {
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS kisisayi FROM KISILER");
            rs.next();
            
            int satirsayisi = rs.getInt("kisisayi");
            
            
            Object[][] liste = new Object[satirsayisi][6];
            String not =jFormattedTextField3.getText();
            
            rs = stmt.executeQuery("SELECT * FROM KISILER WHERE PUAN > "+not);
            stmt.close();
            con.close();
            
            int sayac = 0;
            while(rs.next()){
                liste[sayac][0] = sayac + 1;
                liste[sayac][1] = rs.getString("AD");
                liste[sayac][2] = rs.getString("OGRNO");
                liste[sayac][3] = rs.getString("SINIF");
                liste[sayac][4] = rs.getString("PUAN");
                liste[sayac][5] = rs.getString("CINSIYET");
                sayac++;
            }
            String[] basliklar = {"S.NO","Ad Soyad","Öğrenci No","Sınıf","Not","Cinsiyet"};
            jTable1.setModel(new DefaultTableModel(liste,basliklar));
            
            
            
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Bağlantı hatası..", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_gecenlerlisteleBTNActionPerformed

    private void silMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silMENUActionPerformed
        if(jTable1.getSelectedRow() == -1){
            return;
        }
        
        try {
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            
            int secilisatir = jTable1.getSelectedRow();
            String ad = (String) jTable1.getValueAt(secilisatir, 1);
            stmt.execute(" DELETE FROM KISILER WHERE AD='"+ad+"' ");
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS kisisayi FROM KISILER");
            rs.next();
            
            int satirsayisi = rs.getInt("kisisayi");
            
            Object[][] liste = new Object[satirsayisi][6];
            rs = stmt.executeQuery("SELECT * FROM KISILER");
            stmt.close();
            con.close();
            
            int sayac = 0;
            while(rs.next()){
                liste[sayac][0] = sayac + 1;
                liste[sayac][1] = rs.getString("AD");
                liste[sayac][2] = rs.getString("OGRNO");
                liste[sayac][3] = rs.getString("SINIF");
                liste[sayac][4] = rs.getInt("PUAN");
                liste[sayac][5] = rs.getString("CINSIYET");
                sayac++;
            }
            String[] basliklar = {"S.NO","Ad Soyad","Öğrenci No","Sınıf","Not","Cinsiyet"};
            jTable1.setModel(new DefaultTableModel(liste,basliklar));
            
            
            
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Bağlantı hatası", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
                    
    }//GEN-LAST:event_silMENUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Component[] c = this.getContentPane().getComponents();
        this.getContentPane().setBackground(Color.BLACK);
        jRadioButton1.setForeground(Color.WHITE);
        jRadioButton2.setForeground(Color.WHITE);
        for(int i=0; i<c.length;i++){
            if(c[i] instanceof  JLabel){
                JLabel tmp  = (JLabel) c[i];
                tmp.setForeground(Color.WHITE);
            }
            else if(c[i] instanceof JButton){
                JButton tmp2 = (JButton) c[i];
                tmp2.setBackground(Color.white);
                tmp2.setForeground(Color.black);
            }
            else if(c[i] instanceof JPanel){
                JPanel tmp3 = (JPanel) c[i];
                Border border  = new LineBorder(Color.WHITE,1,true);
                tmp3.setBorder(border);
                tmp3.setBackground(Color.BLACK);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    public Connection myAccessConnection()
    {
        Connection con;
        con = null;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Bağlantı nesnesi
            String strdatabase = "jdbc:ucanaccess://src/pkg211220039_gurkan_soyturk10/veritabani2021.accdb"; //veritabanının ismi
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
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gurkan_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gurkan_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gurkan_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gurkan_10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gurkan_10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton gecenlerlisteleBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem kaydetMenu;
    private javax.swing.JButton ogrenciSilBTN;
    private javax.swing.JMenuItem silMENU;
    private javax.swing.JButton tumverilerlisteleBTN;
    private javax.swing.JButton veriTabaninaYukleBTN;
    private javax.swing.JButton veritabaniBTN;
    // End of variables declaration//GEN-END:variables
}
