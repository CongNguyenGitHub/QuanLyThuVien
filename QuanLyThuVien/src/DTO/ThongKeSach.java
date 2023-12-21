/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ThongKeSach {
    private int maDauSach;
    private String tenDauSach;
    private int soLuotMuon;
    public ThongKeSach() {
    }

    public ThongKeSach(int maDS, String tenDS, int soLuotMuon) {
        this.maDauSach = maDS;
        this.tenDauSach = tenDS;
        this.soLuotMuon = soLuotMuon;
    }

    public int getMaDS() {
        return maDauSach;
    }

    public String getTenDS() {
        return tenDauSach;
    }

    public int getSoLuotMuon() {
        return soLuotMuon;
    }

    public void setMaDS(int maDauSach) {
        this.maDauSach = maDauSach;
    }

    public void setTenDS(String tenDauSach) {
        this.tenDauSach = tenDauSach;
    }

    public void setSoLuotMuon(int soLuotMuon) {
        this.soLuotMuon = soLuotMuon;
    }

   
}
