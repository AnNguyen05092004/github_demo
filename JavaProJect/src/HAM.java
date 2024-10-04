public class HAM {
    public static void xinChao(){  // có thể thay void = int, long, bool
        System.out.println("Hello!");
    }

    public static void printNumber(int a){
        System.out.println(a);
    }

    //*********** Nạp chồng hàm************** */ 
    // Các hàm có cùng tên nhưng khác nhau về tham sô, kiểu trả về
    // Khi hàm được gọi thì tùy vào kiểu dữ liệu của tham số, hàm phù hợp sẽ được gọi
    public static int findMax(int a, int b) {
        if (a>b) {
            return a;
        }
        else return b;
    }
    public static float findMax(float a, float b){
        if (a >b) return a;
        else return b;
    }

    // FIBONACI
    public static boolean fibo(long n){
        if (n==0 || n==1) return true;
        long fn1 = 1, fn2 = 0;
        for(int i=2; i<=92; i++){
            long fn = fn1 + fn2;
            if(fn == n) return true;
            fn2 = fn1;
            fn1 = fn; //cho fn1, fn2 dịch sang phải
        }
        return false;
    }

    // Main--------------
    public static void main (String[] args){
        xinChao();
        int n = 10;
        printNumber(n);
        System.out.println(findMax(10, 20));
        System.out.println(findMax(10.2f, 30.4f));
        System.out.println(fibo(8));
    }
}

/*
 * 1 số hàm hay dùng
 * Math.max, min, sqrt(n), pow(x,y), abs(n)
 * Math.cell(n) : làm tròn lên
 * Math.floor(n) : làm tròn xuống
 * Math.round(n) : làm tròn dựa vào phần thập phân
 * Math.cbrt(n) : căn bậc 3 
 * PI : số pi
 * E : số E
 */