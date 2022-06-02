import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class App112 {
    public static void main(String[] args) {
        String tenSinhVien, thongTin = null;
        String arrThongTin[];   // mảng lưu trữ thông tin sinh viên
        double diemSinhVien;
             
        // lưu trữ danh sách sinh viên
        LinkedList<String> danhSachSV = new LinkedList<>();
             
        // lưu trữ danh sách sinh viên thi lại
        LinkedList<String> svThiLai = new LinkedList<>();
             
        // lưu trữ danh sách sinh viên có điểm cao nhất
        LinkedList<String> svDiemCao = new LinkedList<>();
             
        // lưu trữ danh sách sinh viên cần tìm
        LinkedList<String> svCanTim = new LinkedList<>();
             
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Nhap vao ten cua sinh vien: ");
            tenSinhVien = scanner.nextLine();
            if (!tenSinhVien.isEmpty()) {
                System.out.println("Nhap vao diem cua sinh vien: ");
                diemSinhVien = Double.parseDouble(scanner.nextLine());
                thongTin = tenSinhVien + "\t" + diemSinhVien;
                danhSachSV.add(thongTin);
            }
        } while (!tenSinhVien.isEmpty());   // khi tên còn khác rỗng thì còn nhập
             
        // hiển thị số sinh viên
        // và thông tin của các sinh viên có trong danh sách
        System.out.println("So sinh vien co trong danh sach = " + (danhSachSV.size()));
        System.out.println("Thong tin cua cac sinh vien vua nhap la: ");
        System.out.println("Ten cua sinh vien\t diem");
        Iterator<String> iterator = danhSachSV.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        for (int i = 0; i < danhSachSV.size(); i++) {
            String sv = danhSachSV.get(i);  
     
            arrThongTin = sv.split("\t");
            
            double point = Double.parseDouble(arrThongTin[1]);
                 
            if (point <= 5) {
                svThiLai.add(sv);
            }
        }
                 
        if (svThiLai.isEmpty()) {
            System.out.println("Khong co sinh vien phai thi lai!");
        } else {
            System.out.println("So sinh vien phai thi lai = " + (svThiLai.size()));
            System.out.println("Thong tin cac sinh vien phai thi lai la: ");
            System.out.println("Ten cua sinh vien\t diem");
            iterator = svThiLai.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
             
        double max = 0; 
        int i = 0;  
             
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            
            if (Double.parseDouble(arrThongTin[1]) >= max) {
                max = Double.parseDouble(arrThongTin[1]);
            }
            i++;
        }
     
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            
            if (Double.parseDouble(arrThongTin[1]) == max) {
                svDiemCao.add(danhSachSV.get(i));
            }
            i++;
        }
             
        System.out.println("Thong tin cua sinh vien co diem cao nhat la: ");
        System.out.println("Ten cua sinh vien\t diem");
        iterator = svDiemCao.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
             
        // Tìm kiếm theo tên sinh viên
        System.out.println("Nhap ten sinh vien can tim: ");
        String search = scanner.nextLine();
             
        i = 0;
        while (i < danhSachSV.size()) {
            
            arrThongTin = danhSachSV.get(i).split("\t");
           
            tenSinhVien = arrThongTin[0];
                 
            if (search.equalsIgnoreCase(tenSinhVien)) {
                svCanTim.add(danhSachSV.get(i));
            }
                 
            i++;    
        }
             
        System.out.println("Thong tin cua cac sinh vien ten la " + search + ": ");
        System.out.println("Ten cua sinh vien\t diem");
        iterator = svCanTim.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}