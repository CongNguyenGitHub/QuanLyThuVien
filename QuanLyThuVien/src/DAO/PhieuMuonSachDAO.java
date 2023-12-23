/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import DTO.PhieuMuonSach;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
public class PhieuMuonSachDAO {
    public static Connection conn = Connect.getConnect();

    public static boolean ThemPMS(PhieuMuonSach pms) {
        String sql = "{call THEMPMS(?, ?, ?, ?, ?, ?)}";
        try (PreparedStatement stm = conn.prepareStatement(sql);) {
            stm.setInt(1, pms.getMaDocGia());
            stm.setDate(2, pms.getNgayMuon());
            stm.setDate(3, pms.getHanTra());
            stm.setInt(4, pms.getTongSL());
            stm.setInt(5, pms.getTinhTrang());
            
            stm.setString(6, pms.getXmlString());
            
            return stm.executeUpdate() > 0;
        }
        catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }

    public static boolean KTSanCo(int maDauSach, int soLuongNhap) {
        String query = "select * from DAUSACH where MADAUSACH = ? and SANCO >= ?";
        try (PreparedStatement stm = conn.prepareStatement(query);) {
            stm.setInt(1, maDauSach);
            stm.setInt(2, soLuongNhap);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) return true;
        } catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return false;
    }
    
    public static Vector<Integer> getListMaDauSach() {
        Vector<Integer> listMaDauSach = new Vector<>();
        
        String query = "select MADAUSACH from DAUSACH";
        try (PreparedStatement stm = conn.prepareStatement(query);) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                listMaDauSach.add(rs.getInt("MADAUSACH"));
            }
        } catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return listMaDauSach;
    }
    public static Vector<Integer> getListMaDocGia() {
        Vector<Integer> listMaDauSach = new Vector<>();
        
        String query = "select MADOCGIA from DOCGIA";
        try (PreparedStatement stm = conn.prepareStatement(query);) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                listMaDauSach.add(rs.getInt("MADOCGIA"));
            }
        } catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return listMaDauSach;
    }
    public static String getTenDocGia(int maDocGia) {
        String query = "SELECT HOTEN FROM DOCGIA WHERE MADOCGIA=?";
        String tenDocGia = null;

        try (PreparedStatement stm = conn.prepareStatement(query)) {
            stm.setInt(1, maDocGia);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                // Nếu có ít nhất một dòng kết quả, lấy giá trị TENDOCGIA từ cột đầu tiên
                tenDocGia = rs.getString("HOTEN");
            }
        } catch (SQLException ex) { 
            Logger.getLogger(PhieuMuonSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tenDocGia;
    }
    public static String getTenDauSach(int maDauSach) {
        String query = "SELECT TENDAUSACH FROM DAUSACH WHERE MADAUSACH=?";
        String tenDauSach = null;

        try (PreparedStatement stm = conn.prepareStatement(query)) {
            stm.setInt(1, maDauSach);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                // Nếu có ít nhất một dòng kết quả, lấy giá trị TENDOCGIA từ cột đầu tiên
                tenDauSach = rs.getString("TENDAUSACH");
            }
        } catch (SQLException ex) { 
            Logger.getLogger(PhieuMuonSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tenDauSach;
    }
    public static Vector<Vector<Object>> getListPhieuMuonSach(){
        String sql = "SELECT * from PHIEUMUONSACH ORDER BY MAPHIEUMUONSACH ASC";
        Vector<Vector<Object>> listPMS = new Vector<Vector<Object>>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int maPhieuMuonSach=rs.getInt("MAPHIEUMUONSACH");
                String maDocGia=rs.getString("MADOCGIA");
                Date ngayMuon=rs.getDate("NGAYMUON");
                Vector<Object> row=new Vector<>();
                row.add(maPhieuMuonSach);
                row.add(maDocGia);
                row.add(ngayMuon);
                listPMS.add(row);
            }

        } catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return listPMS;
    }
    
}