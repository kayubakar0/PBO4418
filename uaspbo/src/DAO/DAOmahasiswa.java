/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.koneksi;
import model.mahasiswa;
import DAOinterface.DAOinterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class DAOmahasiswa implements DAOinterface{
    Connection connection;
    final String insert = "INSERT INTO nilai2 (kdmatkul, matkul,uts, uas) VALUES (?, ?, ?, ?);";
     final String select = "SELECT * FROM nilai2;";
   
    public DAOmahasiswa() {
        connection = koneksi.koneksi();
    }

    @Override
    public void insert(mahasiswa b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getKdmatkul());
            statement.setString(2, b.getMatkul());
            statement.setInt(3, b.getUts());
            statement.setInt(4, b.getUas());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public List<mahasiswa> getALL() {
        List<mahasiswa> lb = null;
        try {
            lb = new ArrayList<mahasiswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                mahasiswa b = new mahasiswa();
                b.setKdmatkul(rs.getString("kdmatkul"));
                b.setMatkul(rs.getString("matkul"));
                b.setUts(rs.getInt("uts"));
                b.setUas(rs.getInt("uas"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOmahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lb;
    }
}
