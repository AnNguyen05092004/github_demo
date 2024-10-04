import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Array_List { // Giống mảng 1 chiều nhưng linh động hơn
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++){  // Nhập vào arrlist
            int tmp = sc.nextInt();
            arr.add(tmp);
        }

        arr.add(5);
        arr.add(1); // thêm 1 ptu vào array
        arr.add(2);
        arr.add(3);

        for (int i=0; i< arr.size(); i++){  // Duyệt các ptu
            System.out.println(arr.get(i)); //a[i]
        }
        for (int x: arr){
            System.out.print(x+" ");
        }

        System.out.println(arr.contains(4)); // o(n) ktra xem 4 có trong arr ko
        
        arr.set(2, 100); // Thay giá trị vị trí 2 = 100
        arr.remove(3);   // Xóa ptu ở vị trí 3
        arr.remove((Object)3); // Xóa ptu có giá trị 3
        for (int x: arr){
            System.out.print(x+" ");
        }
        System.out.println(arr.indexOf(100)); // Trả về vị trí đầu tiên có giá trị 100, nếu ko có trả -1

        // --------- Sắp xếp ------------
        // cách 1:
        arr.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // tăng dần
            }  
        });
        // cách 2:
        Collections.sort(arr, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
               return o1 - o2;
            }
        });

    }
}
