/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
import java.sql.Date;

/**
 *
 * @author minh
 */
public class HoaDon  {
   private int maHoaDon;
   private int maDocGia;
   private int tienThu;
   
   public HoaDon(){
   
}

    public HoaDon(int maHoaDon, int maDocGia, int tienThu) {
        this.maHoaDon = maHoaDon;
        this.maDocGia = maDocGia;
        this.tienThu = tienThu;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaDocGia() {
        return maDocGia;
    }

    public int getTienThu() {
        return tienThu;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }

    public void setTienThu(int tienThu) {
        this.tienThu = tienThu;
    }
    
}
