/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;
import java.util.Map;
//import java.util.HashMap;
import java.util.Calendar;

// UI chỉ nhập mã độc giả và danh sách đầu sách + số lượng (map), 
// ngày mượn tự tạo ở UI và truyền xuống, hạn trả DAO tính
// nhưng tạo object thì thêm tình trạng = 0
public class PhieuMuonSach {
    private int maDocGia, tinhTrang, tongSoLuong;
    private Date ngayMuon, hanTra;
    private Map<Integer,Integer> dsSachMuon;
    String xmlString = "";
    
    public PhieuMuonSach() {
        this.maDocGia=this.tinhTrang=this.tongSoLuong=0;
        this.ngayMuon=this.hanTra=null;
        this.dsSachMuon=null;
    }
    
    
    public PhieuMuonSach(int maDocGia, int tinhTrang, int tongSoLuong, Date ngayMuon, Date hanTra, Map<Integer, Integer> dsSachMuon) {
        this.maDocGia = maDocGia;
        this.tinhTrang = tinhTrang;
        this.tongSoLuong = tongSoLuong;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.dsSachMuon = dsSachMuon;
    }
    
    public int getMaDocGia() {
        return this.maDocGia;
    }
    public void setMaDocGia(int mdg) {
        this.maDocGia = mdg;
    }
    
    public int getTinhTrang() {
        return this.tinhTrang;
    }
    public void setTinhTrang(int tt) {
        this.tinhTrang = tt;
    }
    
    public int getTongSL() {
        return this.tongSoLuong;
    }
    public void setTongSL() {
        int sl = 0;
        for (Map.Entry<Integer, Integer> entry : this.dsSachMuon.entrySet()) {
            Integer value = entry.getValue();
            sl += value;
        } 
        this.tongSoLuong = sl;
    }
    
    public Date getNgayMuon() {
        return this.ngayMuon;
    }
    public void setNgayMuon(Date nm) {
        this.ngayMuon = nm;
    }
    
    public Date getHanTra() {
        return this.hanTra;
    }
    public void setHanTra() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.ngayMuon);
        cal.add(Calendar.DATE, 7);
        this.hanTra = new Date(cal.getTime().getTime());
    }
    
    public Map<Integer,Integer> getDSSachMuon() {
        return this.dsSachMuon;
    }
    public void setDSSachMuon(Map<Integer,Integer> dsmap) {
        this.dsSachMuon = dsmap;
    }
    
    public String getXmlString() {
        return this.xmlString;
    }
    public void setXmlString() {
        this.xmlString = "<DsSachMuon>\n";
        for (Map.Entry<Integer, Integer> entry : this.dsSachMuon.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            
            this.xmlString += "<Sach>\n<MaDauSach>%d</MaDauSach>\n<SoLuong>%d</SoLuong>\n</Sach>\n".formatted(key, value);
        }        
        this.xmlString += "</DsSachMuon>";
    }
    
}