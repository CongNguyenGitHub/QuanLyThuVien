/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import DTO.DauSach;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.ResultSet;
import java.util.Vector;

public class DauSachDAO {
    
    public static Connection conn = Connect.getConnect();
    
    public static boolean ThemDauSach(DauSach ds) {
        String sql = "insert into DAUSACH (TENDAUSACH, TACGIA, NXB, NAMXB, VITRI, TONGSO, DANGCHOMUON, SANCO) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = conn.prepareStatement(sql);) {
            stm.setString(1, ds.getTenDauSach());
            stm.setString(2, ds.getTacGia());
            stm.setString(3, ds.getNXB());
            stm.setInt(4, ds.getNamXB());
            stm.setString(5, ds.getViTri());
            stm.setInt(6, ds.getTongSo());
            stm.setInt(7, ds.getDangChoMuon());
            stm.setInt(8, ds.getSanCo());
            return stm.executeUpdate() > 0;
        }
        catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
    }
    
    public static boolean SuaDauSach(DauSach ds, int mds) {       
        String sql = "update DAUSACH set TENDAUSACH = ?, TACGIA = ?, NXB = ?, NAMXB=?, VITRI = ?, TONGSO = ?, SANCO = ? where MADAUSACH = ?";
        try (PreparedStatement stm = conn.prepareStatement(sql);) {
            stm.setString(1, ds.getTenDauSach());
            stm.setString(2, ds.getTacGia());
            stm.setString(3, ds.getNXB());
            stm.setInt(4, ds.getNamXB());
            stm.setString(5, ds.getViTri());
            stm.setInt(6, ds.getTongSo());
            stm.setInt(7, ds.getSanCo());
            stm.setInt(8, mds);
            return stm.executeUpdate() > 0;
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
    
    public static boolean KTNamXB(int nam) {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        return nam<=currentYear;
    }
    
    public static boolean KTTongSoThem(int ts) {
        return ts>0;
    }
    
    public static boolean KTTongSoSua(int mds, int ts) {
        String query = "select TONGSO from DAUSACH where MADAUSACH = ?";
        int tongSo = 0;
        try (PreparedStatement stm = conn.prepareStatement(query);) {
            stm.setInt(1, mds);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) tongSo = rs.getInt("TONGSO");
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
        return ts>=tongSo;
    }
      public static Vector<DauSach> getListDauSach(){ 
        String sql ="SELECT * from DAUSACH ORDER BY MADAUSACH ASC";
        Vector<DauSach> listDauSach = new Vector<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 DauSach ds=new DauSach();
                 ds.setMaDauSach(rs.getInt("MADAUSACH"));
                 ds.setTenDauSach(rs.getString("TENDAUSACH"));
                 ds.setTacGia(rs.getString("TACGIA"));
                 ds.setNXB(rs.getString("NXB"));
                 ds.setNamXB(rs.getInt("NAMXB"));
                 ds.setTongSo(rs.getInt("TONGSO"));
                 ds.setViTri(rs.getString("VITRI"));
                 ds.setSanCo(rs.getInt("SANCO"));
                 ds.setDangChoMuon(rs.getInt("DANGCHOMUON"));
                 listDauSach.add(ds);
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        return listDauSach;
    }
}