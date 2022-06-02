import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        boolean isRemoved = arr.removeIf(t -> t.equals(1));
        if (isRemoved) {
            System.out.println("Xoa thanh cong");
        }
        System.out.print("Cac phan tu con lai: ");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("max: " + Collections.max(arr));
    }
}