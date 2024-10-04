import java.util.Scanner;

public class MANG_2_CHIEU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;

        int[][] a = new int[n][m];
        int[][] b = new int[m][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // NHÂN HAI MA TRẬN
        int[][] c = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Kĩ thuật duyệt các ô liền kề
        // 4 ô hoặc 8 ô
        int[] dx = { -1, 0, 0, 1 };
        int[] dy = { 0, -1, 1, 0 };
        int[][] d = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int i = 1, j = 1;
        for (int k = 0; k < 4; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            System.out.println(d[i1][j1] + " "); // 2 4 6 8
        }
    }}

   /* Sắp xếp mảng hai chiều theo hàng:

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] a = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt(); // hoanh do
            a[i][1] = sc.nextInt(); // tung do
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
} */