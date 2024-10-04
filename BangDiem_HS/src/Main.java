import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double[] tmp = new double[10];
            for(int j=0; j<10; j++){
                tmp[j]=sc.nextDouble();
            }
            HocSinh hs = new HocSinh(i+1, name, tmp);
            arr.add(hs);
        }
        Collections.sort(arr, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if(o1.getTrungBinh() < o2.getTrungBinh()){
                    return 1;
                }
                else return -1;
            }
            
        });
        for(HocSinh x: arr){
            System.out.println(x);
        } 
    }
    
}

