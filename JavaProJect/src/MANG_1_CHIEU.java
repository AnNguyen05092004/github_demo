import java.util.Scanner;



public class MANG_1_CHIEU {
    public static void doubling(int a[], int n){
        for (int i = 0; i < n; i++){
            a[i]*=2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] c = new int[100]; // xin cấp phát mảng c 100 ptu
        float[] b = new float[1000];
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int x: a){
            System.out.print(x +" ");
        }
        System.out.println();
        
        doubling(a, n);
        for (int x: a){
            System.out.print(x +" ");
        }
        System.out.println();
        //-----Mang danh dau-----
        int[] cnt = new int [10000001];
        for(int i = 0; i<n; i++){
            cnt[a[i]]++;
        }
        for(int i = 0; i<=1000000; i++){
            if(cnt[i] !=0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
