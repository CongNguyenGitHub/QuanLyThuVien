/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author minh
 */
public class ChiTietMuonSach  {
    private String maPhieuMuon, maSach,soLuong;

    public ChiTietMuonSach(String maPhieuMuon, String maSach, String soLuong) {
        this.maPhieuMuon = maPhieuMuon;
        this.maSach = maSach;
        this.soLuong = soLuong;
    }

    public ChiTietMuonSach() {
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getSoLuong() {
        return soLuong;
    }

    

   
}
