

import java.util.Scanner;

public class Loang_extra {
    public static int n, m;
    public static int [] dx = {0, 0, -1, 1};
    public static int [] dy = {-1, 1, 0, 0};
    public static int [][] a = new int[105][105];
    public static boolean [][] used = new boolean[105][105];

    public static void loang (int i, int j){
        used[i][j] = true;
        for(int k =0; k<4; k++){
            int i1 = i+dx[k];
            int j1 = j+dy[k];
            if(i1>=1 && i1<=n &&j1>=1 &&j1<=m && a[i1][j1]==1 && used[i1][j1]==false){
                loang(i1, j1);
            }
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =1; j<=m; j++){
                a[i][j]=sc.nextInt();
            }
        }
        int cnt =0;
        for (int i = 1; i<=n; i++){
            for(int j =1; j<=m; j++){
                if(a[i][j]==1 && used[i][j]==false){
                    cnt++;
                    loang(i, j);
                }
            }
        }
        System.out.println(cnt);
    }
}
