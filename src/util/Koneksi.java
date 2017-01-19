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
 * @author abyssBerserker
 */
public class Koneksi {
    public Connection con = null;
    public Statement st = null;
    String db = "jdbc:mysql://localhost/db_uas_15312467";
    
    public void getConnection(){
        try {
            con = DriverManager.getConnection(db, "root", "");
            st = con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal : "+e.getMessage());
        }
    }
}
