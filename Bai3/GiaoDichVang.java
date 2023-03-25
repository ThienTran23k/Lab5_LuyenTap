package Bai3;

public class GiaoDichVang extends GiaoDich {
    public String loaiVang;

    public GiaoDichVang(){
    }
    public GiaoDichVang(String maGiaoDich , int ngayGiaoDich, double donGia, double soLuong , String loaiVang){
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    public String getLoaiVang() {
        return loaiVang;
    }
    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    @Override
    public double ThanhTien(){
        return soLuong * donGia;
    }
    
}
