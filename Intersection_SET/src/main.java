
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int [n];
        int[] b = new int [m];
        for(int i=0; i<n; i++) a[i]= sc.nextInt();
        for(int i=0; i<m; i++) b[i]= sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
