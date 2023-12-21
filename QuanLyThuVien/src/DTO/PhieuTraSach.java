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
import java.time.LocalDate;
/**
 *
 * @author minh
 */
public class PhieuTraSach {
    private int  maPhieuTra,maPhieuMuonSach,soNgayTraTre, tienPhatKiNay;
    private Date ngayTra;

    
    public PhieuTraSach() {
    }

    public PhieuTraSach(int maPhieuTra, int maPhieuMuonSach, int soNgayTraTre, int tienPhatKiNay, Date ngayTra) {
        this.maPhieuTra = maPhieuTra;
        this.maPhieuMuonSach = maPhieuMuonSach;
        this.soNgayTraTre = soNgayTraTre;
        this.tienPhatKiNay = tienPhatKiNay;
        this.ngayTra = ngayTra;
    }

    public int getMaPhieuTra() {
        return maPhieuTra;
    }

    public int getMaPhieuMuon() {
        return maPhieuMuonSach;
    }

    public int getSoNgayTraTre() {
        return soNgayTraTre;
    }

    public int getTienPhatKiNay() {
        return tienPhatKiNay;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setMaPhieuTra(int maPhieuTra) {
        this.maPhieuTra = maPhieuTra;
    }

    public void setMaPhieuMuon(int maPhieuMuon) {
        this.maPhieuMuonSach = maPhieuMuon;
    }

    public void setSoNgayTraTre(int soNgayTraTre) {
        this.soNgayTraTre = soNgayTraTre;
    }

    public void setTienPhatKiNay(int tienPhatKiNay) {
        this.tienPhatKiNay = tienPhatKiNay;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

   
    
    
}


