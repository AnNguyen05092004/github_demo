import java.util.HashSet;
import java.util.Scanner;
//import java.ulti.LinkedHashSet;

public class SET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashSet: lưu các ptu khác nhau, tốc độ tìm kiếm O(1), ko có thứ tự, chỉ lưu được phần tử kiểu đối tượng
        // LinkedHashSet: giống HashSet nhưng có thứ tự ban đầu
        // TreeSet: có thứ tự tăng dần, tìm xóa mất logN

        HashSet<Integer> set = new HashSet<>();
        set.add(100); // Thêm vào set
        set.add(200);
        set.add(300);
        set.add(400);
        for(int x: set){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(set.size());
        set.remove(100); // Xóa 1 ptu có trong set
        for(int x: set){
            System.out.print(x + " ");
        }

        if (set.contains(100)){ // Hàm chứa
            System.out.println("Found");
        }
        else System.out.println("Not Found");
    }
}
