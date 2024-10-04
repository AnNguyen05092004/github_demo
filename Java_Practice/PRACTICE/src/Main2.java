import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Account2[] a = new Account2[n];
        for(int i=0; i<n; i++){
            sc.nextLine();
            a[i] = new Account2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int q = sc.nextInt(); 
        for(int i=0; i<q; i++){
            sc.nextLine();
            String tran = sc.nextLine();
            if (tran.equals("withdraw")){
                String taikhoan = sc.next();
                int tien = sc.nextInt();
                int pos = Account2.findPos(a, taikhoan);
                a[pos].withdraw(tien);
            }
            else if(tran.equals("deposit")){
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = Account2.findPos(a, taiKhoan);
                a[pos].deposit(tien);
            }
            else{
                String x = sc.next();
                String y = sc.next();
                int tien = sc.nextInt();
                int pos1 = Account2.findPos(a, x);
                int pos2 = Account2.findPos(a, y);
                if(a[pos1].getSoDu() - 50000 >=tien ){
                    a[pos1].withdraw(tien);
                    a   [pos2].deposit(tien);
                }
            }
        }
    }
}
