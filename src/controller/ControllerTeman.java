/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelTeman;
import util.Koneksi;

/**
 *
 * @author abyssBerserker
 */
public class ControllerTeman {
    Koneksi konek = new Koneksi();
    String query = "";
    
    public void SimpanData(ModelTeman mt){
        query = "insert into tbl_teman(nama,nope,email) values('"+mt.getNama()+"','"+
                mt.getNope()+"','"+mt.getEmail()+"')";
        try {
            konek.getConnection();
            konek.st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    public void UbahData(ModelTeman mt){
        query = "update tbl_teman set nama=('"+mt.getNama()+"'), nope = ('"+mt.getNope()+"'), email = ('"+mt.getEmail()+
                "') where id = ('"+mt.getId()+"')";
        try {
            konek.getConnection();
            int a = konek.st.executeUpdate(query);
            if(a>0)
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    public void HapusData(ModelTeman mt){
        query = "delete from tbl_teman where id = ('"+mt.getId()+"')";
        try {
            konek.getConnection();
            int a = konek.st.executeUpdate(query);
            if(a>0)
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus", "Informasi", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
}
