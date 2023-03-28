package Bai3;

public class GiaoDichTienTe extends GiaoDich {
    public double tiGia;
    public String loaiTienTe;

    public GiaoDichTienTe(){

    }
    public GiaoDichTienTe(String maGiaoDich , int ngayGiaoDich, double donGia, double soLuong , double tiGia , String loaiTienTe){
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }
    public double getTiGia() {
        return tiGia;
    }
    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }
    public String getLoaiTienTe() {
        return loaiTienTe;
    }
    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public double ThanhTien(){
        return soLuong * donGia * tiGia;
    }
    public double getThanhTien(){
        return soLuong * donGia * tiGia;
    }
}
