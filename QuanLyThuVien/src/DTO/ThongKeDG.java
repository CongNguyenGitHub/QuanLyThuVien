/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class ThongKeDG {
    private int maDocGia;
    private String tenDocGia;
    private int tongSlSachMuon;
    private int tongTienPhat;
    public ThongKeDG(){
        
    }

    public ThongKeDG(int maDocGia, String tenDocGia, int tongSlSachMuon, int tongTienPhat) {
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.tongSlSachMuon = tongSlSachMuon;
        this.tongTienPhat = tongTienPhat;
    }

    public int getMaDocGia() {
        return maDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public int getTongSlSachMuon() {
        return tongSlSachMuon;
    }

    public int getTongTienPhat() {
        return tongTienPhat;
    }

    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public void setTongSlSachMuon(int tongSlSachMuon) {
        this.tongSlSachMuon = tongSlSachMuon;
    }

    public void setTongTienPhat(int tongTienPhat) {
        this.tongTienPhat = tongTienPhat;
    }
    
}
