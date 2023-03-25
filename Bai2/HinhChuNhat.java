package Bai2;

public class HinhChuNhat  extends Hinh{
    float cd , cr;

    public HinhChuNhat(float cd ,float cr){
        super();
        this.cd = cd;
        this.cr = cr;
    }
    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
    this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }
    public String toString(){
        return "Chieu dai : "+ cd + "Chieu rong :"+cr ;
    }
    @Override
    public double DienTich(){
        return cd * cr;
    }


}
