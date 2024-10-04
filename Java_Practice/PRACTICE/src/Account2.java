public class Account2 {
    private String id, customerId;
    private String soTaiKhoan, Pin;
    private int soDu;

    public Account2(String id, String customerId, String soTaiKhoan, String pin, int soDu) {
        this.id = id;
        this.customerId = customerId;
        this.soTaiKhoan = soTaiKhoan;
        Pin = pin;
        this.soDu = soDu;
    }

    public void deposit(int tien){
        this.soDu+=tien;
    }
    public void withdraw(int tien){
        if(this.soDu - 50000>= tien){
            this.soDu -= tien;
        }
    }

    public int getSoDu() {
        return soDu;
    }

    public static int findPos(Account2[] a, String soTaiKhoan){
        for(int i=0; i<a.length; i++){
            if(a[i].soTaiKhoan.equals(soTaiKhoan)){
                return i;
            }
            
        }
        return -1;
    }

    public String toString(){
        return "ID : " + this.id + "\nCusId";
    }
}
