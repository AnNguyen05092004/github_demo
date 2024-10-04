import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MAP { // (Key, Value)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // HashMap: không có thứ tự
        // LinkedHashMap: có thứ tự ban đầu
        // TreeMap: thứ tự tăng dần (tìm kiếm O(logn))
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Double, Float> map2 = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);  // Đưa vào map
        map.put(3, 4);
        map.put(2, 5);

        System.out.println(map.size());
        System.out.println(map.get(2)); // key 2 có val 5
        if (map.containsKey(1)){
            System.out.println("Found");
        }
        else{
            System.out.println(("Not Found"));
        }

        if(map.containsValue(3)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        // map.remove(x): xóa cặp key val x khỏi map nếu có

        // EXAMple : bài tần suất
        int n =sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(map.containsKey(a[i])){
                int tanSuat = map.get(a[i]);
                tanSuat++;
                map.put(a[i], tanSuat);
            }
            else{
                map.put(a[i], 1);
            }
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            if(map.containsKey(a[i])){
                System.out.println(a[i]+" "+map.get(a[i]));
                map.remove(a[i]);
            }
        }
        
        // Duyệt các ptu trong MAP, Map.Entry coi như là kiểu dữ liệu pair
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();//hàm trả về set;
        for(Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // Đưa vào Array list
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : entrySet) {
            arr.add(entry);
        }
        for (int i = 0; i< arr.size(); i++){
            System.out.println((arr.get(i).getKey())+" "+arr.get(i).getValue());
        }
    }
}
