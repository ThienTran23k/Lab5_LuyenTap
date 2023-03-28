package Bai2;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DanhSachHinh ds = new DanhSachHinh();

        
            do {
            System.out.println("Chon 1 them hinh chu nhat - Chon 2 them hinh tron - Chon so khac 1 2 de thoat  ");
            int choose = input .nextInt();
            boolean flag = true;
            switch(choose) {
                case 1 -> {
                    System.out.println("nNhap chieu dai : ");
                    float cd = input .nextFloat();
                    System.out.println("Nhap chieu rong : ");
                    float cr = input .nextFloat();
    
                    Hinh cn = new HinhChuNhat(cd,cr);
                    ds.ThemHinh(cn);
                    ds.InDanhSach();
                    break;
                }    
                case 2 -> {
                    System.out.println("Nhap ban kinh : ");
                    float r = input .nextFloat();
                    Hinh ht = new HinhTron(r);
                    ds.ThemHinh(ht);
                    ds.InDanhSach();
                    break;
                }
                default -> {
                System.out.println("bye");
                flag=false;
                }
            }
        }while (false);
          
    }   
}

