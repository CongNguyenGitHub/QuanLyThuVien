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
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.*;

public class DuLieuBang {
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = Connect.getConnect();
    
    
    public static void Load(String sql, JTable tb)
        {
            
        try {
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e,"Thong bao loi",1);
        }
         
        }
    public static ResultSet ShowTextField(String sql)
    {
    try
    {
        pst= conn.prepareStatement(sql);
        return pst.executeQuery();           
    }
    catch(Exception e)
    {
        return null;
    }
    }

    public static void Load(String sql, DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

