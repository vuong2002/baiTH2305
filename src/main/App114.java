package main;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App114 {
    public static void main(String[] args) throws Exception {
        System.out.print("Nhap so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SinhVien sv = new SinhVien();
        HashMap<Integer, SinhVien> h = new HashMap<>();  
        
        for(int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien thu " + i + ": ");
            sv.nhap();
            h.put(i, sv);
        }
        System.out.println("Nhap ten lop sinh vien can tim: ");
        int lop = sc.nextInt();
        System.out.println("Cac sinh vien co trong lop la: ");
        for(Map.Entry<Integer, SinhVien> s : h.entrySet()) {
            if(s.getValue().getLop() == lop) {
                System.out.println(s.getValue());
            }
        }
        System.out.println("Nhap ma sinh vien can tim: ");
        int masv = sc.nextInt();
        System.out.println("Sinh vien can tim la: ");
        for(Map.Entry<Integer, SinhVien> s : h.entrySet()) {
            if(s.getValue().getMasv() == masv) {
                System.out.println(s.getValue());
            }
        }
    }
}
