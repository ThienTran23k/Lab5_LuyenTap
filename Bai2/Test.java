package Bai2;

import java.util.ArrayList;

public class Test {
    public static void main(String [] args){
        
        ArrayList<HinhChuNhat> hcn = new ArrayList<HinhChuNhat>();
        HinhChuNhat hcn1 = new HinhChuNhat(10, 20);
        HinhChuNhat hcn2 = new HinhChuNhat(12, 20);
        ArrayList<HinhTron> ht = new ArrayList<HinhTron>();
        HinhTron ht1 = new HinhTron(10);
        HinhTron ht2 = new HinhTron(20);
        System.out.println(hcn1.DienTich()); 
        System.out.println(hcn2.DienTich()); 
        System.out.println(ht1.DienTich()); 
        System.out.println(ht2.DienTich()); 
        }
    }

