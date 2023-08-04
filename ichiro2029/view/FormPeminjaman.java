/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ichiro2029.view;
import ichiro2029.controller.*;
/**
 *
 * @author ASUS iD
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    PeminjamanController controller;
    public FormPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.bersihForm();
        controller.isiCombo();
        controller.tampil();
    }
    public  javax.swing.JComboBox getCboAnggota(){
        return cboAnggota;
    }
    public javax.swing.JComboBox getCboBuku(){
        return cboBuku;
    }
    public  javax.swing.JTextField getTxtTglKembali(){
        return txtTglKembali;
    }
    public javax.swing.JTextField getTxtTglPinjam(){
        return txtTglPinjam;
    }
    public javax.swing.JTable getTblPeminjaman(){
        return tblPeminjaman;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboAnggota = new javax.swing.JComboBox<>();
        cboBuku = new javax.swing.JComboBox<>();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglKembali = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 77, 16);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 57, 16);

        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 80, 82, 16);

        jLabel4.setText("Tanggal Kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 114, 87, 16);

        cboAnggota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(cboAnggota);
        cboAnggota.setBounds(130, 10, 388, 22);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBukuActionPerformed(evt);
            }
        });
        getContentPane().add(cboBuku);
        cboBuku.setBounds(127, 41, 388, 22);

        txtTglPinjam.setText("jTextField1");
        txtTglPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglPinjamActionPerformed(evt);
            }
        });
        getContentPane().add(txtTglPinjam);
        txtTglPinjam.setBounds(127, 77, 388, 22);

        txtTglKembali.setText("jTextField2");
        getContentPane().add(txtTglKembali);
        txtTglKembali.setBounds(127, 111, 388, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(10, 170, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(120, 170, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(230, 170, 72, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(340, 170, 72, 23);

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Anggota", "Kode Buku", "Tgl Pinjam", "Tgl Kembali"
            }
        ));
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 500, 180);

        setSize(new java.awt.Dimension(535, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAnggotaActionPerformed

    private void cboBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboBukuActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.savePeminjaman();
        controller.tampil();
        controller.bersihForm();
        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updatePeminjaman();
        controller.tampil();
        controller.bersihForm();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deletePeminjaman();
        controller.tampil();
        controller.bersihForm();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.bersihForm();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        // TODO add your handling code here:
        controller.getPeminjaman();
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void txtTglPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglPinjamActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboAnggota;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    // End of variables declaration//GEN-END:variables
}
