/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktikum10_1402023032;
import java.util.Random;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LUTHFI
 */
public class Ojol extends javax.swing.JFrame {
    private Connection conn = null;
    
    /**
     * Creates new form NewJFrame
     */
    public Ojol() {
        initComponents();
        labelCaptcha.setText(generateCaptcha(7));
        buttonGroup1.add(buttonPria);
        buttonGroup1.add(buttonWanita);
    }

    public static Boolean checkCaptcha(String captcha, String user_Captcha){
        return captcha.equals(user_Captcha);
    }
    
    static String generateCaptcha(int n){
        Random rand = new Random(62);
        String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String captcha = "";
        while(n -->0){
            int index = (int)(Math.random()*62);
            captcha += chrs.charAt(index);
        }
        return captcha;
    }
   
    public void resetForm(){
        namaDepan.setText("");
        namaBelakang.setText("");
        buttonGroup1.clearSelection();
        jenisPengemudi.setSelectedItem("Pilih Jenis Pengemudi");
        jCheckBox1.setSelected(false);
        inputCaptcha.setText("");
        labelCaptcha.setText(generateCaptcha(7));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNamaDepan = new javax.swing.JLabel();
        labelNamaBelakang = new javax.swing.JLabel();
        namaDepan = new javax.swing.JTextField();
        namaBelakang = new javax.swing.JTextField();
        labelJenisKelamin = new javax.swing.JLabel();
        buttonPria = new javax.swing.JRadioButton();
        buttonWanita = new javax.swing.JRadioButton();
        jenisPengemudi = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        labelCaptcha = new javax.swing.JLabel();
        labelMasukkanCaptcha = new javax.swing.JLabel();
        inputCaptcha = new javax.swing.JTextField();
        buttonLihatList = new javax.swing.JButton();
        buttonRegistrasi = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ojek Online FTI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Daftar Sekarang !");

        labelNamaDepan.setText("Nama Depan");

        labelNamaBelakang.setText("Nama Belakang");

        namaDepan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaDepanActionPerformed(evt);
            }
        });

        namaBelakang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBelakangActionPerformed(evt);
            }
        });

        labelJenisKelamin.setText("Jenis Kelamin");

        buttonPria.setText("Pria");
        buttonPria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPriaActionPerformed(evt);
            }
        });

        buttonWanita.setText("Wanita");

        jenisPengemudi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Pengemudi", "Mobil", "Motor" }));

        jCheckBox1.setText("Saya menyetujui peraturan yang berlaku");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelMasukkanCaptcha.setText("Masukkan Captcha");

        inputCaptcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCaptchaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMasukkanCaptcha)
                    .addComponent(inputCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMasukkanCaptcha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        buttonLihatList.setBackground(new java.awt.Color(255, 204, 255));
        buttonLihatList.setText("LIHAT PENDAFTAR");
        buttonLihatList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLihatListActionPerformed(evt);
            }
        });

        buttonRegistrasi.setBackground(new java.awt.Color(255, 204, 0));
        buttonRegistrasi.setText("DAFTAR SEKARANG !");
        buttonRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonLihatList, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRegistrasi))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCheckBox1)
                        .addComponent(labelJenisKelamin)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelNamaDepan)
                            .addGap(71, 71, 71)
                            .addComponent(labelNamaBelakang))
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonPria))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonWanita)
                                .addComponent(namaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jenisPengemudi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaDepan)
                    .addComponent(labelNamaBelakang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaDepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaBelakang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJenisKelamin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPria)
                    .addComponent(buttonWanita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenisPengemudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLihatList)
                    .addComponent(buttonRegistrasi))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaDepanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaDepanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaDepanActionPerformed

    private void namaBelakangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaBelakangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaBelakangActionPerformed

    private void buttonPriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPriaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void buttonRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrasiActionPerformed
        // TODO add your handling code here:
        if(namaDepan.getText().isEmpty() && namaBelakang.getText().isEmpty() && buttonGroup1.getSelection() == null && jenisPengemudi.getSelectedItem().toString().equals("Pilih Jenis Pengemudi") && !jCheckBox1.isSelected() && inputCaptcha.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isi Form Terlebih Dahulu", "FORM KOSONG", JOptionPane.WARNING_MESSAGE);
        }else{
            if(namaDepan.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nama depan harus terisi!", "NAMA DEPAN KOSONG", JOptionPane.WARNING_MESSAGE);
            }else{
                if(buttonGroup1.getSelection() == null){
                    JOptionPane.showMessageDialog(this, "Mohon pilih jenis kelamin terlebih dahulu!", "JENIS KELAMIN TIDAK DIPILIH", JOptionPane.WARNING_MESSAGE);
                }else{
                    if(inputCaptcha.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Mohon isi captcha terlebih dahulu!", "CAPTCHA KOSONG", JOptionPane.WARNING_MESSAGE);
                    }else{
                        if(labelCaptcha.getText().equals(inputCaptcha.getText())){
                            if(jCheckBox1.isSelected()){
                                if(!"Pilih Jenis Pengemudi".equals(jenisPengemudi.getSelectedItem().toString())){
                                    try{
                                        if(conn == null || conn.isClosed()){
                                            conn = Connect.getConnected();
                                        }

                                        String query = "INSERT INTO tabel_ojol (namaDepan, namaBack, jenisKelamin, kendaraan) values (?, ?, ?, ?)";

                                        try(PreparedStatement ps = conn.prepareStatement(query)){
                                            ps.setString(1, namaDepan.getText());
                                            ps.setString(2, namaBelakang.getText());
                                            ps.setString(3, buttonGroup1.getSelection().isSelected() ? "Pria" : "Wanita");
                                            ps.setString(4, jenisPengemudi.getSelectedItem().toString());
                                            ps.executeUpdate();
                                        }
                                        JOptionPane.showMessageDialog(this, "Registration Success!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                        resetForm();
                                    }catch(SQLException ex){
                                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "Mohon pilih jenis pengemudi terlebih dahulu!", "JENIS PENGEMUDI TIDAK DIPILIH", JOptionPane.WARNING_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "Kotak persetujuan harus dicentang!", "KOTAK PERSETUJUAN KOSONG", JOptionPane.WARNING_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Captcha tidak sesuai!", "CAPTCHA SALAH", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_buttonRegistrasiActionPerformed

    private void buttonLihatListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLihatListActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "Nama Depan", "Nama Belakang", "Jenis Kelamin", "Jenis Pengemudi"}, 0);
        JTable table = new JTable(tableModel);
        
        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);
        
        jDialog1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jDialog1.setContentPane(panel);
        jDialog1.pack();
        jDialog1.setVisible(true);
        
        try{
            if(conn == null || conn.isClosed()){
                conn = Connect.getConnected();
            }
            
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM tabel_ojol");
            
            while(resultSet.next()){
                int id = resultSet.getInt("ID");
                String namaDepan = resultSet.getString("namaDepan");
                String namaBack = resultSet.getString("namaBack");
                String jenisKelamin = resultSet.getString("jenisKelamin");
                String kendaraan = resultSet.getString("kendaraan");
                
                tableModel.addRow(new Object[] {id, namaDepan, namaBack, jenisKelamin, kendaraan});
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_buttonLihatListActionPerformed

    private void inputCaptchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCaptchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCaptchaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ojol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ojol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonLihatList;
    private javax.swing.JRadioButton buttonPria;
    private javax.swing.JButton buttonRegistrasi;
    private javax.swing.JRadioButton buttonWanita;
    private javax.swing.JTextField inputCaptcha;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jenisPengemudi;
    private javax.swing.JLabel labelCaptcha;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelMasukkanCaptcha;
    private javax.swing.JLabel labelNamaBelakang;
    private javax.swing.JLabel labelNamaDepan;
    private javax.swing.JTextField namaBelakang;
    private javax.swing.JTextField namaDepan;
    // End of variables declaration//GEN-END:variables
}
