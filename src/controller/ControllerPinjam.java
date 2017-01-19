/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPinjam;
import util.Koneksi;

/**
 *
 * @author abyssBerserker
 */
public class ControllerPinjam {
    Koneksi koneksi = new Koneksi();
    String query = "";
    
    public void SimpanData(ModelPinjam mp){
        query = "insert into tbl_pinjam(namaTeman, barangDipinjam) values('"+
                mp.getNama()+"','"+
                mp.getBarang()+"')";
        try {
            koneksi.getConnection();
            koneksi.st.executeUpdate(query);
            koneksi.st.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    public void UbahData(ModelPinjam mp){
        query = "update tbl_pinjam set namaTeman=('"+mp.getNama()+"'), barangDipinjam = ('"+mp.getBarang()+"') where id = ('"+mp.getId()+"')";
        try {
            koneksi.getConnection();
            koneksi.st.executeUpdate(query);
            koneksi.st.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    public void HapusData(ModelPinjam mp){
        query = "delete from tbl_pinjam where id=('"+mp.getId()+"')";
        try {
            koneksi.getConnection();
            koneksi.st.executeUpdate(query);
            koneksi.st.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
}
