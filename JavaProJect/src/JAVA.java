import java.util.Scanner;

public class JAVA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        outer : for(int i = 1; i<=3; i++){ // Dán nhãn để break cả vòng ngoài
            System.out.println("ABC");
            for(int j =1; j <=5; j++){
                System.out.println(i+" "+j);
                if (j==3){
                    break outer; // muốn kết thúc ctr dùng: return;
                }
            }
        }
    }
}
