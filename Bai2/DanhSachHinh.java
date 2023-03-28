package Bai2;

import java.util.ArrayList;

public class DanhSachHinh {
    public ArrayList<Hinh> list;

    public DanhSachHinh(ArrayList<Hinh> list ){
        this.list = list ;

    }
    DanhSachHinh() {     
        this.list = new ArrayList<Hinh>();
    }
    public void ThemHinh(Hinh s){
        list.add(s) ;
    }
    public void InDanhSach(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

}
