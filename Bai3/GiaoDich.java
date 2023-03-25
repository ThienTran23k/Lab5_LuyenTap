package Bai3;

public class GiaoDich {
    public String maGiaoDich;
    public int ngayGiaoDich;
    public double donGia;
    public double soLuong;

    public GiaoDich(){
        
    }

    public GiaoDich(String maGiaoDich , int ngayGiaoDich, double donGia, double soLuong){
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public int getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(int ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    public double ThanhTien(){
        return 0;
    }
}
