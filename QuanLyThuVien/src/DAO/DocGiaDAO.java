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
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Vector;

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
        } catch (SQLException e) {
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
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }

    public static boolean KTNgaySinh(Date ns, Date nlt) {
        int comparisonResult = ns.compareTo(nlt);
        return comparisonResult < 0;
    }

    public static boolean KTHanThe(int mdg) {
        LocalDate ngayHienTai = LocalDate.now();
        LocalDate ngayDenHan = null;
        String query = "select NGDENHAN from DOCGIA where MADOCGIA = ?";
        try (PreparedStatement stm = conn.prepareStatement(query);) {
            stm.setInt(1, mdg);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                ngayDenHan = rs.getDate("NGDENHAN").toLocalDate();
            }
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
        long dateDiff = ChronoUnit.DAYS.between(ngayDenHan,ngayHienTai);
        return dateDiff >= 7;
    }

    public static Vector<DocGia> getListDocGia() {
        String sql = "SELECT * from DOCGIA ORDER BY MADOCGIA ASC";
        Vector<DocGia> listDocGia = new Vector<>();
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                DocGia ds = new DocGia();
                ds.setMaDocGia(rs.getInt("MADOCGIA"));
                ds.setHoTen(rs.getString("HOTEN"));
                ds.setNgaySinh(rs.getDate("NGAYSINH"));
                ds.setLoaiDocGia(rs.getInt("LOAIDG"));
                ds.setDiaChi(rs.getString("DIACHI"));
                ds.setEmail(rs.getString("EMAIL"));
                ds.setNgayLapThe(rs.getDate("NGLAPTHE"));
                ds.setNgayDenHan(rs.getDate("NGDENHAN"));
                ds.setTienNo(rs.getInt("TIENNO"));
                listDocGia.add(ds);
            }

        } catch (SQLException e) {
            throw new ArithmeticException(e.getMessage());
        }
        return listDocGia;
    }
}
