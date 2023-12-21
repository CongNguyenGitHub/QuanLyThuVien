/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ThongKeSach;
import DTO.ThongKeDG;
import DAO.Connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {
    public static Connection conn = Connect.getConnect();
    public static Vector<ThongKeSach> getListThongKeSach(int month,int year){
        
        String sql ="""
                    SELECT DAUSACH.MADAUSACH,DAUSACH.TENDAUSACH,COUNT(PHIEUMUONSACH.MAPHIEUMUONSACH) AS SOLUOTMUON
                    FROM   DAUSACH
                    LEFT JOIN CTMS ON DAUSACH.MADAUSACH = CTMS.MADAUSACH
                    LEFT JOIN PHIEUMUONSACH ON CTMS.MAPHIEUMUONSACH = PHIEUMUONSACH.MAPHIEUMUONSACH
                    WHERE  MONTH(PHIEUMUONSACH.NGAYMUON) = ? AND YEAR(PHIEUMUONSACH.NGAYMUON) = ?
                    GROUP BY    DAUSACH.MADAUSACH, DAUSACH.TENDAUSACH,DAUSACH.NXB
                    ORDER BY    SOLUOTMUON DESC""";
        Vector<ThongKeSach> list = new Vector<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1, month);
            stm.setInt(2, year);
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 ThongKeSach tks=new ThongKeSach();
                 tks.setMaDS(rs.getInt("MADAUSACH"));
                 tks.setTenDS(rs.getString("TENDAUSACH"));
                 tks.setSoLuotMuon(rs.getInt("SOLUOTMUON"));
                 list.add(tks);
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        return list;
    }
    public static Vector<ThongKeDG> getListThongKeDG(int month,int year){
        Vector<ThongKeDG> list=new Vector<>();
        String sql="""
                   SELECT  DOCGIA.MADOCGIA, DOCGIA.HOTEN, SUM(ISNULL(PHIEUMUONSACH.TONGSL, 0)) AS TONGSLSACHMUON,
                       SUM(ISNULL(PHIEUTRASACH.TIENPHATKINAY, 0)) AS TONGTIENPHAT
                   FROM  DOCGIA
                   LEFT JOIN PHIEUMUONSACH ON DOCGIA.MADOCGIA = PHIEUMUONSACH.MADOCGIA
                   LEFT JOIN PHIEUTRASACH ON PHIEUMUONSACH.MAPHIEUMUONSACH = PHIEUTRASACH.MAPHIEUMUONSACH
                   WHERE MONTH(PHIEUMUONSACH.NGAYMUON) = ? AND YEAR(PHIEUMUONSACH.NGAYMUON) = ?
                   GROUP BY  DOCGIA.MADOCGIA, DOCGIA.HOTEN
                   ORDER BY  TONGSLSACHMUON DESC""";
        
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1, month);
            stm.setInt(2, year);
             ResultSet rs = stm.executeQuery();
             while(rs.next()){
                 ThongKeDG tkdg=new ThongKeDG();
                 tkdg.setMaDocGia(rs.getInt("MADOCGIA"));
                 tkdg.setTenDocGia(rs.getString("HOTEN"));
                 tkdg.setTongSlSachMuon(rs.getInt("TONGSLSACHMUON"));
                 tkdg.setTongTienPhat(rs.getInt("TONGTIENPHAT"));
                 list.add(tkdg);
                 
             }   
                
            } catch (SQLException e) {
                throw new ArithmeticException(e.getMessage());
            }
        
        
        return list;
        
    }
    
        
    
}
