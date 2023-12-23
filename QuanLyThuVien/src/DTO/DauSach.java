/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class DauSach {
    private String tenDauSach, tacGia, NXB, viTri;
    private int maDauSach,namXB, tongSo, sanCo, dangChoMuon; 

    public DauSach(int maDauSach, String tenDauSach, String tacGia, String NXB, String viTri, int namXB, int tongSo, int sanCo, int dangChoMuon) {
        this.maDauSach = maDauSach;
        this.tenDauSach = tenDauSach;
        this.tacGia = tacGia;
        this.NXB = NXB;
        this.viTri = viTri;
        this.namXB = namXB;
        this.tongSo = tongSo;
        this.sanCo = sanCo;
        this.dangChoMuon = dangChoMuon;
    }

    

    public DauSach() {
        this.tenDauSach=this.tacGia=this.NXB=this.viTri="";
        this.maDauSach=this.namXB=this.tongSo=this.sanCo=this.dangChoMuon=0;
    }

    public int getMaDauSach() {
        return maDauSach;
    }

    public String getTenDauSach() {
        return tenDauSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public String getViTri() {
        return viTri;
    }

    public int getNamXB() {
        return namXB;
    }

    public int getTongSo() {
        return tongSo;
    }

    public int getSanCo() {
        return sanCo;
    }

    public int getDangChoMuon() {
        return dangChoMuon;
    }

    public void setMaDauSach(int maDauSach) {
        this.maDauSach = maDauSach;
    }

    public void setTenDauSach(String tenDauSach) {
        this.tenDauSach = tenDauSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public void setTongSo(int tongSo) {
        this.tongSo = tongSo;
    }

    public void setSanCo(int sanCo) {
        this.sanCo = sanCo;
    }

    public void setDangChoMuon(int dangChoMuon) {
        this.dangChoMuon = dangChoMuon;
    }
  
}