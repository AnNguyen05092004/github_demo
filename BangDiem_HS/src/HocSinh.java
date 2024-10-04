public class HocSinh {
    private String ma, ten;
    private double[] diem;

    public HocSinh(int ma, String ten, double[] diem) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diem = new double [10];
        for(int i=0; i<10; i++){
            this.diem[i] = diem[i];
        }
    }
    
    public double getTrungBinh(){
        double res = 0;
        for(int i=0; i<10; i++){
            res+=this.diem[i];
        }
        return res/10;
    }
    
    public String toString(){
        String result ="";
        double trungBinh = this.getTrungBinh();
        if(trungBinh >=9) result="XUAT SAC";
        else if (trungBinh >=8) result ="GIOI";
        else if(trungBinh >=7) result = "KHA";
        else if(trungBinh >=5) result = "TB";
        else result = "YEU";
        return this.ma+" "+this.ten+" "+ String.format("%.1f", this.getTrungBinh() +" "+result);
    }
}
