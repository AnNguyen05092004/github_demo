
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt(); // Nhập a từ bàn phím
        System.out.println(a);
        float b = sc.nextFloat();
        System.out.println(b);
        char kiTu = sc.nextLine().charAt(0); // nhập 1 kí tự, có thể bị lỗi do đọc dấu enter ở trc tạo xâu rỗng
        System.out.println(kiTu);
    }
}
