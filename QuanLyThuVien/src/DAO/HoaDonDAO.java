/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Admin
 */
import java.sql.*;
import DTO.HoaDon;
import java.util.List;
import DTO.HoaDon;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HoaDonDAO {

    public static Connection conn = Connect.getConnect();
    public static Vector<Integer> getlistMaDocGia(){
        Vector<Integer> listMaDocGia=new Vector<>();
        String sql="SELECT MADOCGIA FROM DOCGIA WHERE TIENNO>0";
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
             ResultSet rs = stm.executeQuery();
            while(rs.next()){
                listMaDocGia.add(rs.getInt("MADOCGIA"));
                 
            }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        return listMaDocGia;
    }
    public static int getTongTienNo(int maDocGia){
        String sql="SELECT TIENNO FROM DOCGIA WHERE MADOCGIA=?";
        int tongTienNo=0;
        try (PreparedStatement stm = conn.prepareStatement(sql);) {
            stm.setString(1, Integer.toString(maDocGia));
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                tongTienNo=rs.getInt("TIENNO");
            }
        }
       catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tongTienNo;
        
    }

    public static void ThemHoaDon(HoaDon hd) {
        String sql="{call THEMHOADON(?,?,?)}";
        try (CallableStatement stm = conn.prepareCall(sql);) {
                stm.setInt(1,hd.getMaDocGia());
                stm.setDate(2,hd.getNgayHoaDon());
                stm.setInt(3, hd.getTienThu());
                stm.execute();
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
    }
   
  
    public static Vector<HoaDon> getlistHOADON(){
        String sql="select* from HOADON";
        Vector<HoaDon> listHoaDon=new Vector<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 HoaDon hd=new HoaDon();
                 hd.setMaHoaDon(rs.getInt("MAHD"));
                 hd.setMaDocGia(rs.getInt("MADOCGIA"));
                 hd.setTienThu(rs.getInt("TIENTHU"));
                 hd.setNgayHoaDon(rs.getDate("NGHOADON"));
                 listHoaDon.add(hd);
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        return listHoaDon;
        
    }
    public static String getTenDocGia(int maDocGia){
        String sql="select HOTEN from DOCGIA where MADOCGIA=?";
        String tenDocGia="";
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1,maDocGia);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
               tenDocGia=rs.getString("HOTEN");
                }   
                
            } 
            catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        return tenDocGia;
    }
       
}
