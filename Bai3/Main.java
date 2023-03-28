package Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

    ArrayList<GiaoDichVang> listGDV = new ArrayList<GiaoDichVang>();
    
    GiaoDichVang GDV1 = new GiaoDichVang("mx_xx1", 21, 150000000, 10.5,"Vang_9999" );
    GiaoDichVang GDV2 = new GiaoDichVang("mx_xx2", 18, 200000000, 18,"Vang_12k" );
    GiaoDichVang GDV3 = new GiaoDichVang("mx_xx3", 19, 225000000, 19,"Vang_18k" );
    System.out.printf("Giao Dich Vang lan 1 : %f \n",GDV1.ThanhTien());
    System.out.printf("Giao Dich Vang lan 2 : %f \n",GDV2.ThanhTien());
    System.out.printf("Giao Dich Vang lan 3 : %f \n",GDV3.ThanhTien());
    listGDV.add(GDV1);
    listGDV.add(GDV2);
    listGDV.add(GDV3);
    // tính tổng các phần tử số lượng của GDV
    double tongSoLuong = 0 ;
    for (GiaoDich GD : listGDV) {
        if ( GD instanceof GiaoDichVang){
            tongSoLuong += GD.getSoLuong();
        }

    }   
    System.out.println("Tong so luong = "  + tongSoLuong);

    ArrayList<GiaoDichTienTe> listGDTT = new ArrayList<GiaoDichTienTe>();    
    GiaoDichTienTe GDTT1 = new GiaoDichTienTe("GDT_001", 10,5000000, 20, 25000, "USD");
    GiaoDichTienTe GDTT2 = new GiaoDichTienTe("GDT_002", 15,12000000, 10, 25365, "EUR");
    GiaoDichTienTe GDTT4 = new GiaoDichTienTe("GDT_004", 17,234000000, 15, 1, "VND");
    System.out.printf("Giao Dich Tien Te lan 1 : %f \n",GDTT1.ThanhTien());
    System.out.printf("Giao Dich Tien Te lan 2 : %f \n",GDTT2.ThanhTien());
    System.out.printf("Giao Dich Tien Te lan 3 : %f \n",GDTT4.ThanhTien());
    listGDTT.add(GDTT1);
    listGDTT.add(GDTT2);
    listGDTT.add(GDTT4);
    double Tong = 0;
    double TrungBinh =0;
    for (GiaoDichTienTe GDTT : listGDTT ) {
        if ( GDTT instanceof GiaoDichTienTe){
            Tong +=   GDTT.getThanhTien();
            TrungBinh = (Tong /3);
            
        }
    }   
    System.out.printf("Trung binh  = %.2f ",TrungBinh);
}
}
