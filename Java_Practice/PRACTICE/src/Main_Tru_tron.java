import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main_Tru_tron {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList <Cylinder> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            String color = sc.next();
            double banKinh = sc.nextDouble();
            double chieuCao = sc.nextDouble();
            arr.add(new Cylinder(banKinh, color, chieuCao));
        }
        Collections.sort(arr, new Comparator<Cylinder>() {

            @Override
            public int compare(Cylinder o1, Cylinder o2) {
                if (o1.getVolume() != o2.getVolume()){
                    if(o1.getVolume()>o2.getVolume()){
                        return -1;
                    }
                    return 1;
                }
                return o1.getColor().compareTo(o2.getColor());
            }
            
        });
        for(Cylinder x : arr){
            System.out.println(x);
        }
    }
}
// 9 
// red 19 164
// white 13 156
// white 16 168
// green 13 191
// grey 11 159
// white 12 144
// green 11 182
// blue 14 194
// white 14 131