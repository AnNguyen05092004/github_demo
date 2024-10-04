import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;

public class String_Usage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kiểm tra kí tự
        String s = "java  28tech  C++ 28tech.com.vn";
        int digit = 0, lower = 0, upper = 0, special = 0;
        for(char x : s.toCharArray()){
            if (Character.isDigit(x)) digit++;
            else if (Character.isLowerCase(x)) lower++;
            else if (Character.isUpperCase(x)) upper++;
            else special++;
        }
        System.out.println(digit+" "+lower+" "+upper+" "+special);

        // CHuyển xâu thành số và ngược lại
        int n = 2804;
        String s1 = ""+ n;
        System.out.println(s1);
        System.out.println(Integer.parseInt(s1));

        // Bài toán số lớn
        String s2 = "1234567890098765432109874567";
        int sum = 0;
        for (char x : s2.toCharArray()){
            sum += x - '0';
        }
        System.out.println(sum);

        // Xử lý số nguyên lớn bằng lớp BigInteger
        String s3 = "2345678765435675678";
        String s4 ="987653456098765445";
        BigInteger num1 = new BigInteger(s3);
        BigInteger num2 = new BigInteger(s4);
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2));

        // Tần suất xuất hiện của kí tự trong xâu
        // C1: Dùng mảng
        String s5 = "vanan05092004";
        int[] cnt = new int[256];
        for(char x: s5.toCharArray()){
            cnt[x]++;
        }
        for(int i=0; i<256; i++){
            if(cnt[i]!=0){
                System.out.println((char)i +" "+cnt[i]);
            }
        }

        // C2: Dùng Map
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char x: s5.toCharArray()){
            if (map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else map.put(x, 1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet){
            System.out.println(entry.getKey + " " + entry.getValue());
        }

        // Lớp StringBuider: chuẩn hóa họ tên
        // String trong java 1 khi khai báo không thể chèn, xóa, thêm nên có thể dùng lớp này
        String s = "NgUyEn THuy lInh";
        StringBuider sb = new StringBuilder("");
        String[] arr = s.split("\\s+");
        for(String x: arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for(int j=0; j<x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1); //xóa dấu cách thừa
        System.out.println(sb.toString());

        //OUT PUT: Nguyen Thuy Linh
    }
}
