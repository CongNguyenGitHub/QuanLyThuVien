/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author minh
 */
public class ChiTietTraSachHoaDon {
    private int sONGAYTRATRE, tIENPHAt;
    private String tenDauSach;
    public ChiTietTraSachHoaDon() {
    }

    public int getsONGAYTRATRE() {
        return sONGAYTRATRE;
    }

    public void setsONGAYTRATRE(int sONGAYTRATRE) {
        this.sONGAYTRATRE = sONGAYTRATRE;
    }

    public int gettIENPHAt() {
        return tIENPHAt;
    }

    public void settIENPHAt(int tIENPHAt) {
        this.tIENPHAt = tIENPHAt;
    }

    public String getTenDauSach() {
        return tenDauSach;
    }

    public void setTenDauSach(String tenDauSach) {
        this.tenDauSach = tenDauSach;
    }

    public ChiTietTraSachHoaDon(int sONGAYTRATRE, int tIENPHAt, String tenDauSach) {
        this.sONGAYTRATRE = sONGAYTRATRE;
        this.tIENPHAt = tIENPHAt;
        this.tenDauSach = tenDauSach;
    }

    

   
}
