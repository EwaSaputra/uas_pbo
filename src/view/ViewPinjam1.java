/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ControllerPinjam;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelPinjam;
import util.Koneksi;

/**
 *
 * @author abyssBerserker
 */
public class ViewPinjam1 extends javax.swing.JPanel {

    ControllerPinjam cp = new ControllerPinjam();
    ModelPinjam mp = new ModelPinjam();
    Koneksi k = new Koneksi();
    String query = "";
    /**
     * Creates new form ViewPinjam1
     */
    public ViewPinjam1() {
        initComponents();
    }

    void firstInit(){
        btBaru.setEnabled(true);
        btBatal.setVisible(false);
        btBersih.setEnabled(false);
        btCari.setEnabled(false);
        btSimpan.setEnabled(false);
        btUbah.setEnabled(false);
        btHapus.setEnabled(false);
        btTutup.setEnabled(true);
        txtID.setEditable(false);
        txtNama.setEditable(false);
        txtBarang.setEditable(false);
    }
    
    void buttonBaru(){
        btBaru.setVisible(false);
        btBatal.setVisible(true);
        btSimpan.setEnabled(true);
        txtID.setEditable(true);
        txtNama.setEditable(true);
        txtBarang.setEditable(true);
        btCari.setEnabled(true);
    }
    
    void tampilData(){
        query = "select * from tbl_pinjam";
        try {
            k.getConnection();
            ResultSet rs = k.st.executeQuery(query);
            while(rs.next()){
                dtm.addRow(new Object[]{
                    rs.getString("ID"),
                    rs.getString("namaTeman"),
                    rs.getString("barangDipinjam")
                });
            }
            tb_DataPinjam.setModel(dtm);
            k.st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan");
            System.err.println(e.getMessage());
        }
    }
    
    void buttonEdit(){
        btBaru.setVisible(false);
        btBatal.setVisible(true);
        btSimpan.setEnabled(false);
        txtID.setEditable(true);
        txtNama.setEditable(true);
        txtBarang.setEditable(true);
        btBersih.setEnabled(true);
        btCari.setEnabled(true);
        btUbah.setEnabled(true);
        btHapus.setEnabled(true);
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
        txtID = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbNama = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBarang = new javax.swing.JTextArea();
        btCari = new javax.swing.JButton();
        btBaru = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btBersih = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btTutup = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_DataPinjam = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Nama");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 76, -1));
        add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 201, -1));

        cbNama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 201, -1));

        jLabel3.setText("Barang");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtBarang.setColumns(20);
        txtBarang.setRows(5);
        jScrollPane1.setViewportView(txtBarang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 385, 60));

        btCari.setText("Cari");
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });
        add(btCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        btBaru.setText("Baru");
        btBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBaruActionPerformed(evt);
            }
        });
        add(btBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        add(btSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        btBersih.setText("Bersih");
        btBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBersihActionPerformed(evt);
            }
        });
        add(btBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });
        add(btUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        add(btHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        btTutup.setText("Tutup");
        btTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTutupActionPerformed(evt);
            }
        });
        add(btTutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        btBatal.setText("Batal");
        add(btBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        tb_DataPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Teman ", "Barang Dipinjam"
            }
        ));
        tb_DataPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_DataPinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_DataPinjam);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 440, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
        query = "select * from tbl_teman where nama like '%"+txtNama.getText()+"%'";
        try {
            k.getConnection();
            cbNama.removeAllItems();
            ResultSet rs = k.st.executeQuery(query);
            while(rs.next()){
                cbNama.addItem("nama");
            }
            k.st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btCariActionPerformed

    private void btBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBaruActionPerformed
        // TODO add your handling code here:
        buttonBaru();
        txtNama.requestFocus();
    }//GEN-LAST:event_btBaruActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        if(cbNama.getSelectedItem().equals("") || txtBarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Harap Masukkan Data Dengan Benar", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            txtNama.requestFocus();
        }else{
            if(JOptionPane.showConfirmDialog(this, "Apakah Anda Ingin Menyimpan Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION)==0){
                try {
                    mp.setNama(cbNama.getSelectedItem().toString());
                    mp.setBarang(txtBarang.getText());
                    cp.SimpanData(mp);
                    dtm.getDataVector().removeAllElements();
                    tampilData();
                    bersih();
                    firstInit();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Terjadi Kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBersihActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_btBersihActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Apakah Anda Ingin Mengubah Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION)==0){
            try {
                mp.setId(Integer.parseInt(txtID.getText()));
                mp.setNama(cbNama.getSelectedItem().toString());
                mp.setBarang(txtBarang.getText());
                cp.UbahData(mp);
                dtm.getDataVector().removeAllElements();
                tampilData();
                bersih();
                firstInit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Terjadi Kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btUbahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Apakah Anda Ingin Menghapus Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION)==0){
            try {
                mp.setId(Integer.parseInt(txtID.getText()));
                cp.HapusData(mp);
                dtm.getDataVector().removeAllElements();
                tampilData();
                bersih();
                firstInit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Terjadi Kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTutupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btTutupActionPerformed

    private void tb_DataPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_DataPinjamMouseClicked
        // TODO add your handling code here:
        baris = tb_DataPinjam.getRowCount();
        txtID.setText(tb_DataPinjam.getValueAt(baris, 0).toString());
        cbNama.setSelectedItem(tb_DataPinjam.getValueAt(baris, 1).toString());
        txtBarang.setText(tb_DataPinjam.getValueAt(baris, 2).toString());
        buttonEdit();
    }//GEN-LAST:event_tb_DataPinjamMouseClicked

    void bersih(){
        txtID.setText("");
        txtNama.setText("");
        txtBarang.setText("");
        cbNama.setSelectedItem("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaru;
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btBersih;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btTutup;
    private javax.swing.JButton btUbah;
    private javax.swing.JComboBox cbNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_DataPinjam;
    private javax.swing.JTextArea txtBarang;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    int baris = 0;
    static Object[] kolom = {"ID", "Nama", "Barang Dipinjam"};
    DefaultTableModel dtm = new DefaultTableModel(kolom, baris);
}
