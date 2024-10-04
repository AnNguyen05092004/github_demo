import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        Account [] a = new Account[n];
        for(int i=0; i<n; i++){
            a[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());

        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String name = sc.nextLine();
            String pass = sc.nextLine();
            boolean ok = false;
            for(int i=0; i<n; i++){
                if(a[i].check(name, pass)){
                    ok = true;
                }
            }
            if(ok) System.out.println("Login successful");
            else System.out.println("Fail");
        }
    }
}
