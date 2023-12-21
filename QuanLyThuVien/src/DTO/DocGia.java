/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date; 

public class DocGia {
    private int loaiDocGia;
    private String hoTen, diaChi, email;
    private Date ngaySinh, ngayLapThe, ngayDenHan;
    private int tienNo;
    
    public DocGia() {
        this.hoTen=this.diaChi=this.email="";
        this.loaiDocGia=this.tienNo=0;
        this.ngaySinh=new Date(System.currentTimeMillis());
    }

    public DocGia(int loaiDocGia, String hoTen, String diaChi, String email, Date ngaySinh, Date ngayLapThe, Date ngayDenHan, int tienNo) {
        this.loaiDocGia = loaiDocGia;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.ngayLapThe = ngayLapThe;
        this.ngayDenHan = ngayDenHan;
        this.tienNo = tienNo;
    }
    
 
    
    public String getHoTen() {
        return this.hoTen;
    }
    public void setHoTen(String ht) {
        this.hoTen = ht;
    }
    
    public int getLoaiDocGia() {
        return this.loaiDocGia;
    }
    public void setLoaiDocGia(int ldg) {
        this.loaiDocGia = ldg;
    }
    
    public Date getNgaySinh() {
        return this.ngaySinh;
    }
    public void setNgaySinh(Date ns) {
        this.ngaySinh = ns;
    }
    
    public String getDiaChi() {
        return this.diaChi;
    }
    public void setDiaChi(String dc) {
        this.diaChi = dc;
    }
    
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String em) {
        this.email = em;
    }
    
    public Date getNgayLapThe() {
        return this.ngayLapThe;
    }
    public void setNgayLapThe(Date nlt) {
        this.ngayLapThe = nlt;
    }
    
    public Date getNgayDenHan() {
        return this.ngayDenHan;
    }
    public void setNgayDenHan(Date ndh) {
        this.ngayDenHan = ndh;
    }
   
    public int getTienNo() {
        return this.tienNo;
    }
    public void setTienNo(int tn) {
        this.tienNo = tn;
    }
}