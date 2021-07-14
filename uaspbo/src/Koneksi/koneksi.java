/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class koneksi {
    Connection koneksi;
    
    public static Connection koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection config = DriverManager.getConnection("jdbc:mysql://localhost/uaspbo", "root", "");
            
            return config;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
