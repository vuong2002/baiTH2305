package main;
import java.util.Scanner;
public class SinhVien {
    
	private String hoten;
	int masv;
	private int lop;
	public SinhVien(String hoten, int masv, int lop) {
		this.hoten = hoten;
		this.masv = masv;
		this.lop = lop;
	}
	public SinhVien() {
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	@Override
	public String toString() {
		return "Ho ten: "+hoten+"\t"+"Ma sinh vien: "+masv+"\t"+"Lop: "+lop;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoten =sc.next();
		System.out.println("Nhap ma sinh vien: ");
		masv =sc.nextInt();
		System.out.println("Nhap lop: ");
		lop =sc.nextInt();
	}

}
