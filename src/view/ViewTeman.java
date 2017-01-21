/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.table.DefaultTableModel;
import util.Koneksi;
import model.ModelTeman;
import controller.ControllerTeman;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * 
 */
public class ViewTeman extends javax.swing.JPanel implements ActionListener, ComponentListener, MouseListener {

    ControllerTeman ct = new ControllerTeman();
    ModelTeman mt = new ModelTeman();
    Koneksi kon = new Koneksi();
    String query = "";
    /**
     * Creates new form ViewTeman
     */
    public ViewTeman() {
        initComponents();
        firstIntial();
        tampilTeman();
    }

    void firstIntial(){
        baru.setVisible(true);
        batal.setVisible(false);
        baru.setEnabled(true);
        simpan.setEnabled(false);
        bersih.setEnabled(false);
        ubah.setEnabled(false);
        hapus.setEnabled(false);
        tutup.setEnabled(true);
        id.setEditable(false);
        nama.setEditable(false);
        no.setEditable(false);
        email.setEditable(false);
    }
    
    void btBaru(){
        baru.setVisible(false);
        baru.setEnabled(false);
        batal.setVisible(true);
        batal.setVisible(true);
        simpan.setEnabled(true);
        bersih.setEnabled(true);
        ubah.setEnabled(true);
        hapus.setEnabled(true);
        tutup.setEnabled(true);
        nama.setEditable(true);
        no.setEditable(true);
        email.setEditable(true);
    }
    void tampilTeman(){
        try {
            query = "select * from tbl_teman";
            kon.getConnection();
            ResultSet rs = kon.state.executeQuery(query);
            while(rs.next()){
                dtm.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("nama"),
                    rs.getString("nope"),
                    rs.getString("email")
                });
            }
            tabel.setModel(dtm);
            kon.state.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "terjadi kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
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
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        bersih = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tutup = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        baru = new javax.swing.JButton();

        setName("Form"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID :");
        jLabel1.setName("jLabel1"); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 14, 78, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama :");
        jLabel2.setName("jLabel2"); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, 78, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("No. Hp :");
        jLabel3.setName("jLabel3"); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 66, 78, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email :");
        jLabel4.setName("jLabel4"); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 92, 78, -1));

        id.setName("id"); // NOI18N
        id.addComponentListener(this);
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 11, 40, -1));

        nama.setName("nama"); // NOI18N
        add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 37, 144, -1));

        no.setName("no"); // NOI18N
        add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 63, 144, -1));

        email.setName("email"); // NOI18N
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 89, 144, -1));

        batal.setText("Batal");
        batal.setName("batal"); // NOI18N
        batal.addActionListener(this);
        add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 67, -1));

        simpan.setText("Simpan");
        simpan.setName("simpan"); // NOI18N
        simpan.addActionListener(this);
        add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 48, -1, -1));

        bersih.setText("Bersih");
        bersih.setName("bersih"); // NOI18N
        bersih.addActionListener(this);
        add(bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 77, 67, -1));

        ubah.setText("Ubah");
        ubah.setName("ubah"); // NOI18N
        ubah.addActionListener(this);
        add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 19, 63, -1));

        hapus.setText("Hapus");
        hapus.setName("hapus"); // NOI18N
        hapus.addActionListener(this);
        add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 48, -1, -1));

        tutup.setText("Tutup");
        tutup.setName("tutup"); // NOI18N
        tutup.addActionListener(this);
        add(tutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 77, 63, -1));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "No Handphone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.setName("tabel"); // NOI18N
        tabel.addMouseListener(this);
        jScrollPane1.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 432, 250));

        baru.setText("Baru");
        baru.setName("baru"); // NOI18N
        baru.addActionListener(this);
        add(baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 19, 67, -1));
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == batal) {
            ViewTeman.this.batalActionPerformed(evt);
        }
        else if (evt.getSource() == simpan) {
            ViewTeman.this.simpanActionPerformed(evt);
        }
        else if (evt.getSource() == bersih) {
            ViewTeman.this.bersihActionPerformed(evt);
        }
        else if (evt.getSource() == ubah) {
            ViewTeman.this.ubahActionPerformed(evt);
        }
        else if (evt.getSource() == hapus) {
            ViewTeman.this.hapusActionPerformed(evt);
        }
        else if (evt.getSource() == tutup) {
            ViewTeman.this.tutupActionPerformed(evt);
        }
        else if (evt.getSource() == baru) {
            ViewTeman.this.baruActionPerformed(evt);
        }
    }

    public void componentHidden(java.awt.event.ComponentEvent evt) {
    }

    public void componentMoved(java.awt.event.ComponentEvent evt) {
    }

    public void componentResized(java.awt.event.ComponentEvent evt) {
    }

    public void componentShown(java.awt.event.ComponentEvent evt) {
        if (evt.getSource() == id) {
            ViewTeman.this.idComponentShown(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == tabel) {
            ViewTeman.this.tabelMouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }// </editor-fold>//GEN-END:initComponents

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        firstIntial();
        Bersih();
    }//GEN-LAST:event_batalActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        // TODO add your handling code here:
        btBaru();
        Bersih();
        nama.requestFocus();
    }//GEN-LAST:event_baruActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if(nama.getText().isEmpty() || no.getText().isEmpty() || email.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Harap masukkan data dengan benar", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            nama.requestFocus();
        }else{
            if(JOptionPane.showConfirmDialog(this, "Apakah anda ingin menyimpan data ?", "Konfirmasi", 
                    JOptionPane.YES_NO_OPTION)== 0){
                mt.setNama(nama.getText());
                mt.setNope(no.getText());
                mt.setEmail(email.getText());
                try {
                    ct.SimpanData(mt);
                    dtm.getDataVector().removeAllElements();
                    tampilTeman();
                    firstIntial();
                    Bersih();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "terjadi kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void idComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_idComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_idComponentShown

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_bersihActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        baris = tabel.getSelectedRow();
        id.setText(tabel.getValueAt(baris, 0).toString());
        nama.setText(tabel.getValueAt(baris, 1).toString());
        no.setText(tabel.getValueAt(baris, 2).toString());
        email.setText(tabel.getValueAt(baris, 3).toString());
        btBaru();
    }//GEN-LAST:event_tabelMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Apakah anda ingin mengubah data ?", "Konfirmasi", 
                    JOptionPane.YES_NO_OPTION)== 0){
            mt.setId(Integer.parseInt(id.getText()));
            mt.setNama(nama.getText());
            mt.setNope(no.getText());
            mt.setEmail(email.getText());
            try {
                ct.UbahData(mt);
                dtm.getDataVector().removeAllElements();
                tampilTeman();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "terjadi kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getMessage());
            }
        }
        
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Apakah anda ingin menghapus data ?", "Konfirmasi", 
                    JOptionPane.YES_NO_OPTION)== 0){
            mt.setId(Integer.parseInt(id.getText()));
            try {
                ct.HapusData(mt);
                dtm.getDataVector().removeAllElements();
                tampilTeman();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "terjadi kesalahan", "Informasi", JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_tutupActionPerformed

    void Bersih(){
        id.setText("");
        nama.setText("");
        no.setText("");
        email.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baru;
    private javax.swing.JButton batal;
    private javax.swing.JButton bersih;
    private javax.swing.JTextField email;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tutup;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

    int baris = 0;
    static Object[] kolom = {"ID", "Nama", "No Handphone", "Email"};
    DefaultTableModel dtm = new DefaultTableModel(kolom, baris);
}
