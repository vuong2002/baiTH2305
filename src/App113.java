import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class App113 {
    public static void main(String[] args) {
        String fruit;
        int n;
        Scanner scanner = new Scanner(System.in);
     
        HashSet<String> hashSetFruits = new HashSet<String>();
         
        System.out.println("Nhap vao so phan tu cua hashSetFruits: ");
        n = scanner.nextInt();  
        fruit = scanner.nextLine();
             
        System.out.println("Nhap vao ten cac loai trai cay: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten loai trai cay thu " + i + ": ");
            fruit = scanner.nextLine();
            hashSetFruits.add(fruit);
        }
     
        System.out.println("So phan tu cua hashSetFruits = " + hashSetFruits.size());
          
        
        System.out.println("Nhap vao ten loai trai cay can tim: ");
        String fruitSearch = scanner.nextLine();
        if (hashSetFruits.contains(fruitSearch)) {
            System.out.println("Co " + fruitSearch + " trong hashSetFruits!");
        } else {
            System.out.println("Khong co " + fruitSearch);
        }
             
       
        System.out.println("Nhap vao ten loai trai cay can xoa: ");
        String fruitDelete = scanner.nextLine();
     
        if (hashSetFruits.contains(fruitDelete)) {
            hashSetFruits.remove(fruitSearch);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con la co trong hashSetFruits: " + hashSetFruits);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
             
    
        List<String> listFruits = new ArrayList<>();
        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Melon");
        listFruits.add("Coconut");
        listFruits.add("Apple");
        listFruits.add("Watermelon");
        listFruits.add("Orange");
    
        hashSetFruits.addAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi them: ");
        Iterator<String> iterator = hashSetFruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
             
       
        hashSetFruits.removeAll(listFruits);
        System.out.println("\nCac phan tu co trong hashSetFruits sau khi xoa: " + hashSetFruits);
    }
}