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
public class CuonSach {
   private int mASACH, mADAUSACH;
   private String tINHTRANG;

    public CuonSach() {
    }

    public CuonSach(int mASACH, int mADAUSACH, String tINHTRANG) {
        this.mASACH = mASACH;
        this.mADAUSACH = mADAUSACH;
        this.tINHTRANG = tINHTRANG;
    }

    public int getmASACH() {
        return mASACH;
    }

    public void setmASACH(int mASACH) {
        this.mASACH = mASACH;
    }

    public int getmADAUSACH() {
        return mADAUSACH;
    }

    public void setmADAUSACH(int mADAUSACH) {
        this.mADAUSACH = mADAUSACH;
    }

    public String gettINHTRANG() {
        return tINHTRANG;
    }

    public void settINHTRANG(String tINHTRANG) {
        this.tINHTRANG = tINHTRANG;
    }

   
   
}

