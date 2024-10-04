import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SAPXEP_TIM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); // O(logn) 0=>10^6
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // Arrays.sort(a, 2, 5); // sxep tu vi tri 2 -> 4
        // ****************************************************************** */

        // --------sort có cmp cần mảng kiểu đối tượng---------
        Integer[] A = { 1, 4, 2, 5, 7, 6, 3 };
        Arrays.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Nếu muốn o1 xuất hiện trước o2 trả về -1
                // Nếu muốn o1 xuất hiện sau o2 trả về 1
                if (Math.abs(o1) != Math.abs(o2)) {
                    if (Math.abs(o1) > Math.abs(o2))
                        return -1;
                    else
                        return 1;
                }
                else{
                    if (o1 > o2) return -1;
                    else return 1;
                }
            }
        });
        for (int x : A) {
            System.out.print(x + " ");
        }
         //----------- Tìm kiếm-------Binary search
         // Chỉ áp dụng khi cần tìm kiếm nhiều lần do cần sắp xếp mảng O(nlogn)
        /*public static boolean binarySearch(int a[] // ArrayList<Integer> arr, int n, int x){
            int l= 0, r = n-1;
            while(l<=r){
                int m = (l+r)/2;
                if(a[m]==x){
                    return true;
                }
                else if (a[m] < x){
                    l = m+1;
                }
                else{
                    r = m-1;
                }
            }
            return false;
        }*/
        // CÓ HÀM 
        System.out.println(Arrays.binarySearch(a, 4)); // trả về chỉ số nếu tìm thấy ko thì trả về -(vị trí chèn)-1 (số âm)
    }
}
