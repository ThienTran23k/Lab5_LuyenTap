package Bai2;

public class HinhTron extends Hinh {
    float r;
    public HinhTron() {
    }
    public HinhTron(float r){
        this.r = r ;
    }

    public float getR() {
        return r;
    }
    public void setR(float r) {
        this.r = r;
    }
    public String toString(){
        return "Ban kinh = "+ r + " , Dien tich = "+DienTich(); 
    }
    @Override
    public double DienTich(){
        return 3.14 * r*r ; 
    }

}
