/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class DauSach {
    private String tenDS, tacGia, NXB, viTri;
    private int namXB, tongSo, sanCo, dangChoMuon; 

    public DauSach(String tenDS, String tacGia, String NXB, String viTri, int namXB, int tongSo, int sanCo, int dangChoMuon) {
        this.tenDS = tenDS;
        this.tacGia = tacGia;
        this.NXB = NXB;
        this.viTri = viTri;
        this.namXB = namXB;
        this.tongSo = tongSo;
        this.sanCo = sanCo;
        this.dangChoMuon = dangChoMuon;
    }

    public DauSach() {
        this.tenDS=this.tacGia=this.NXB=this.viTri="";
        this.namXB=this.tongSo=this.sanCo=this.dangChoMuon=0;
    }
    
    
    
    public String getTenDS() {
        return this.tenDS;
    }
    public void setTenDS(String tds) {
        this.tenDS = tds;
    }
    
    public String getTacGia() {
        return this.tacGia;
    }
    public void setTacGia(String tg) {
        this.tacGia = tg;
    }
    
    public String getNXB() {
        return this.NXB;
    }
    public void setNXB(String nxb) {
        this.NXB = nxb;
    }
    
    public String getViTri() {
        return this.viTri;
    }
    public void setViTri(String vt) {
        this.viTri = vt;
    }
    
    public int getNamXB() {
        return this.namXB;
    }
    public void setNamXB(int nam) {
        this.namXB = nam;
    }
    
    public int getTongSo() {
        return this.tongSo;
    }
    public void setTongSo(int ts) {
        this.tongSo = ts;
    }
    
    public int getDangChoMuon() {
        return this.dangChoMuon;
    }
    public void setDangChoMuon(int sl) {
        this.dangChoMuon = sl;
    }
    
    public int getSanCo() {
        return this.sanCo;
    }
    public void setSanCo() {
        this.sanCo = this.tongSo - this.dangChoMuon;
    }
    
}