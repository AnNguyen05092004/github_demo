import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// có n điểm trong hệ tọa độ OXy, sắp xếp các điểm này theo hoành độ tăng dần
// Nếu 2 điểm có cùng hoành độ thì sắp theo tung độ tăng dần.

public class PAIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] a = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        Arrays.sort(a, new Comparator<Integer[]>() { // Integer[] : các dòng trong ma trận

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }

        });
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.println(a[i][0]+" "+a[i][1]);
        }
    }
}
