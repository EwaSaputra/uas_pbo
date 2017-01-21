/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * 
 */
public class Koneksi {
    public Connection konek = null;
    public Statement state = null;
    String db = "jdbc:mysql://localhost/db_uas_15312432";
    
    public void getConnection(){
        try {
            konek = DriverManager.getConnection(db, "root", "");
            state = konek.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal : "+e.getMessage());
        }
    }
}
