/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NguoiDung;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class NguoiDungDAO {
    
    public static Connection conn = Connect.getConnect();
    
    public static boolean KTNguoiDung(NguoiDung user) {
        String query = "select * from NGUOIDUNG where TEN = ? and MATKHAU = ?";
        
        try (PreparedStatement stm = conn.prepareStatement(query)) {
            stm.setString(1, user.getTen());
            stm.setString(2, user.getMatKhau());
            ResultSet rs = stm.executeQuery();
            if(rs.next()) return true;
        }
        catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
        return false;
    }
}