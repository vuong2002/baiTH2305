import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class App110 {
    public static void main(String[] args){
    ArrayList<Integer> arrLisInteger = new ArrayList<>();
     arrLisInteger.add(5);
     arrLisInteger.add(7);
     arrLisInteger.add(20);
     arrLisInteger.add(25);
     arrLisInteger.add(10);
     arrLisInteger.add(2);

     //hiển thị ra giá trị max của arrayLisInteger
    System.out.println("Phan tu lon nhat trong arrayList: " + Collections.max(arrLisInteger));


    arrLisInteger.add(5);// nhập vào 1 số nguyên
    boolean isRemoved = arrLisInteger.remove(Integer.valueOf(5));
        if (isRemoved) {
            System.out.println("Xoa thanh cong");
        }
        System.out.print("Cac phan tu con lai: ");
        for (Integer i : arrLisInteger) {
            System.out.print(i + "\t");
        }   
        // sử dụng phương thức sort() để sắp xếp theo thứ tự giảm dần
    arrLisInteger.sort(Comparator.naturalOrder());
    System.out.println("\ncac phan tu sau khi da sap xep: " + arrLisInteger);
    }
}