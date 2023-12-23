/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Admin
 */
import DTO.PhieuTraSach;
import DTO.ChiTietTraSach;
import java.util.*;
import java.sql.Date;
/**
 *
 * @author Admin
 */
import java.sql.*;

public class PhieuTraSachDAO {
    public static Connection conn = Connect.getConnect();
    public static Vector<Integer> getListMaPhieuMuonSach(){
        Vector<Integer> listMaPhieuMuonSach = new Vector<>();
        String sql="select MAPHIEUMUONSACH from PHIEUMUONSACH where TINHTRANG=0";
         try (PreparedStatement stm = conn.prepareStatement(sql)) {    
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 int MAPHIEUMUONSACH=rs.getInt("MAPHIEUMUONSACH");
                 listMaPhieuMuonSach.add(MAPHIEUMUONSACH);
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
         
         
         return listMaPhieuMuonSach;
        
        
    }
    public static int getMaDocGia(int maPhieuMuonSach){
        int i=0;
        String sql="select MADOCGIA from PHIEUMUONSACH where MAPHIEUMUONSACH=?";
         try (PreparedStatement stm = conn.prepareStatement(sql)) { 
             stm.setInt(1, maPhieuMuonSach);
             ResultSet rs = stm.executeQuery();
             if(rs.next()){
                 i=rs.getInt("MADOCGIA");
             }
             
               
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        
        return i;
    }
    public static String getTenDocGia(int maDocGia){
        String hoTen="";
        String sql="select HOTEN from DOCGIA where MADOCGIA=?";
         try (PreparedStatement stm = conn.prepareStatement(sql)) { 
             stm.setInt(1, maDocGia);
             ResultSet rs = stm.executeQuery();
             if(rs.next()){
                 hoTen=rs.getString("HOTEN");
             }
             
                  
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        
        return hoTen;
    }
   
    public static Vector<ChiTietTraSach> getCTTS(int maPhieuMuonSach){
        Vector<ChiTietTraSach> listCTTS=new Vector<>();
        String sql="select* from CTTS,PHIEUTRASACH PTS where PTS.MAPHIEUMUONSACH=? AND CTTS.MAPHIEUTRA=PTS.MAPHIEUTRA ";
        try (PreparedStatement stm = conn.prepareStatement(sql)) { 
            
             stm.setInt(1, maPhieuMuonSach);
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 int maDauSach=rs.getInt("MADAUSACH");
                 int tienPhat=rs.getInt("TIENPHAT");
                 int maPhieuTra=rs.getInt("MAPHIEUTRA");
                 ChiTietTraSach ctts=new ChiTietTraSach(maDauSach,maPhieuTra,tienPhat);
                 listCTTS.add(ctts);
                 
             }
             
                  
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        
        return listCTTS;
    }
    public static String getTenDauSach(int maDauSach){
        String tenDauSach="";
        String sql="select TENDAUSACH from DAUSACH where MADAUSACH=?";
         try (PreparedStatement stm = conn.prepareStatement(sql)) { 
             stm.setInt(1, maDauSach);
             ResultSet rs = stm.executeQuery();
             if(rs.next()){
                tenDauSach=rs.getString("TENDAUSACH");
             }
             
                  
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        
        return tenDauSach;
    }
    
    
    public static void InsertPhieuTraSach(PhieuTraSach pts){
        String sql="{call THEMPTS(?, ?)}";
        try (CallableStatement stmt = conn.prepareCall(sql);) {
                stmt.setInt(1,pts.getMaPhieuMuon());
                stmt.setDate(2, pts.getNgayTra());
                stmt.execute();
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
    }
    public static Vector<PhieuTraSach> getListPhieuTraSach(){
        String sql = "SELECT * from PHIEUTRASACH ORDER BY MAPHIEUMUONSACH ASC";
        Vector<PhieuTraSach> listPTS = new Vector<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                PhieuTraSach pts=new PhieuTraSach();
                pts.setMaPhieuTra(rs.getInt("MAPHIEUTRA"));
                pts.setMaPhieuMuon(rs.getInt("MAPHIEUMUONSACH"));
                pts.setNgayTra(rs.getDate("NGAYTRA"));
                pts.setSoNgayTraTre(rs.getInt("SONGAYTRATRE"));
                pts.setTienPhatKiNay(rs.getInt("TIENPHATKINAY"));
                listPTS.add(pts);
            }

        } catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return listPTS;
    }
}


