/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author adria
 */
public class koneksi {
    static Connection con;
    
    public static Connection connection() {
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_dutacoding");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
            } catch (SQLException ex){
                System.out.println();
            }
        }
        return con;
    }
}
