/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DocGia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.temporal.ChronoUnit;

public class DocGiaDAO {
    
    public static Connection conn = Connect.getConnect();
    
    public static boolean ThemDocGia(DocGia dg) {
        String sql = "insert into DOCGIA (HOTEN, LOAIDG, NGAYSINH, DIACHI, EMAIL, NGLAPTHE, NGDENHAN, TIENNO) values (?, ?, ?, ?, ?, ?, ?, ?) ";
        try (PreparedStatement stm = conn.prepareStatement(sql);) {
            stm.setString(1, dg.getHoTen());
            stm.setInt(2, dg.getLoaiDocGia());
            stm.setDate(3, dg.getNgaySinh());
            stm.setString(4, dg.getDiaChi());
            stm.setString(5, dg.getEmail());
            stm.setDate(6, dg.getNgayLapThe());
            stm.setDate(7, dg.getNgayDenHan());
            stm.setInt(8, dg.getTienNo());
            return stm.executeUpdate() > 0;
        }
        catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }
    
    public static boolean SuaDocGia(DocGia dg, int mdg) {
        String sql = "update DOCGIA set HOTEN = ?, LOAIDG = ?, NGAYSINH = ?, DIACHI=?, EMAIL = ? where MADOCGIA = ?";
        try (PreparedStatement stm = conn.prepareStatement(sql);) {
            stm.setString(1, dg.getHoTen());
            stm.setInt(2, dg.getLoaiDocGia());
            stm.setDate(3, dg.getNgaySinh());
            stm.setString(4, dg.getDiaChi());
            stm.setString(5, dg.getEmail());
            stm.setInt(6, mdg);
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
    
    public static boolean GiaHanThe(int mdg) {
        String sql = "{call GIAHANTHE(?)}";
        try (CallableStatement stm = conn.prepareCall(sql);) {
            stm.setInt(1, mdg);
            return stm.execute();
        }
        catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
    
    public static boolean KTNgaySinh(Date ns, Date nlt) {
        int comparisonResult = ns.compareTo(nlt);
        return comparisonResult < 0;
    }
    
    public static boolean KTHanThe(int mdg) {
        Date currentDate = new Date(System.currentTimeMillis());
        Date ngayDenHan = null;
        String query = "select NGDENHAN from DOCGIA where MADOCGIA = ?";
        try (PreparedStatement stm = conn.prepareStatement(query);) {
            stm.setInt(1, mdg);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) ngayDenHan = rs.getDate("NGDENHAN");
        }
        catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
        long dateDiff = ChronoUnit.DAYS.between(currentDate.toLocalDate(), ngayDenHan.toLocalDate());
        return dateDiff >= 7;
    }
}