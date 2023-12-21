package DTO;

/**
 *
 * @author Admin
 */
public class ChiTietTraSach {
    private int maDauSach,maPhieuTra,tienPhat;
    
    public ChiTietTraSach(){
        
    }
    public ChiTietTraSach(int maDauSach,int maPhieuTra, int tienPhat){
        this.maDauSach=maDauSach;
        this.maPhieuTra=maPhieuTra;
        this.tienPhat=tienPhat;
    }

    public int getMaDauSach() {
        return maDauSach;
    }

    public int getMaPhieuTra() {
        return maPhieuTra;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setMaDauSach(int maDauSach) {
        this.maDauSach = maDauSach;
    }

    public void setMaPhieuTra(int maPhieuTra) {
        this.maPhieuTra = maPhieuTra;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }
    
   
}
