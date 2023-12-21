/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author minh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connect {
    private  static Connection conn=null;
    
    public static Connection getConnect(){
        String hostname = "LAPTOP-4CPH3R26";
        String db = "QLTV";
        String port = "1433";
        String username = "sa";
        String password = "123456789";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectURL = "jdbc:sqlserver://" + hostname + ":" + port + ";DatabaseName=" + db + ";encrypt=true;trustServerCertificate=true;";
            conn = DriverManager.getConnection(connectURL, username, password);
            //JOptionPane.showMessageDialog(null,"Ket noi co so du lieu thanh cong ");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Ket noi co so du lieu khong thanh cong ");
        }
        return conn;
    }
}