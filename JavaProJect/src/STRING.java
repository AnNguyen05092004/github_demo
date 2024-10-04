import java.util.Scanner;
// STring 1 khi đã khai báo là ko thay đổi được kí tự trong xâu
import java.util.StringTokenizer;

public class STRING {
    // Viết hàm trả về dạng in thường của xâu s
    public static String convert(String s){
        String res = "";
        for(int i=0; i<s.length(); i++){
            res += Character.toLowerCase(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine(); // đọc phím enter thừa của next int/float/long
        
        String s = sc.nextLine(); // nhập dòng có dấu cách, có bị trôi lệnh lấy enter phía trước
        String a = sc.next(); // nhập 1 từ ko có cách

        System.out.println(s);
        System.out.println(s.length());
        // Duyệt xâu
        for(int i=0; i< s.length(); i++){
            System.out.println(s.charAt(i));
        }

        // for x
        for(char x: s.toCharArray()){ // đổi xâu thành mảng kí tự
            System.out.println(x);
        }

        // -------------Các hàm thông dụng-----------------------
        s = s.toUpperCase(); // chuyển hết thành In Hoa
        s = s.toLowerCase(); // Chuyển hết thành In thường
        s = s.concat(a); // Nối a vào sau s HOẶC s = s + a + ..
        String t = "java";
        System.out.println(s.compareTo(t)); // trả về số âm (s-t) nếu s < t và ngược lại
        System.out.println(s.compareToIgnoreCase(t)); // so sánh không phân biệt hoa thường
        
        // kiểm tra 2 xâu giống nhau
        if (t.compareTo("java")==0){
            System.out.println("YES");
        }
        if (t.equals("java")){
            System.out.println("YES");
        }

        // Hàm substring trả về xâu con
        System.out.println(s.substring(5)); // Xâu con cắt từ chỉ số 5 đến cuối dãy
        System.out.println(s.subSequence(5, 7)); // cắt đoạn từ 5 đến 6

        // Hàm contains() : kiểm tra sự tồn tại của xâu con
        System.out.println(s.contains("an"));

        // Hàm replace : thay thế kí tự trong xâu bằng 1 kí tự khác
        s = s.replace('n', '@'); // thay tất cả n bằng @

        // 1 Số hàm kiểm tra loại KÍ TỰ
        isDigit(char c) : kiểm tra chữ số
        isLowerCase(char c) : kiểm tra chữ in thường
        isUpperCase(char c) : Kiểm tra chữ in hoa
        isAlphabetic(char c) : kiểm tra chữ cái
        char toLowerCase(char c) : chuyển thành chữ in thường
        char toUpperCase(char c) : Chuyển thành chữ in hoa
        

        // ----------- Tách từ ------------------
        String s = "Ngon ngu lap trinh";
        String[] a = s.plit(" "); // tách từ trong xâu vào lưu vào mảng a
        String[] a = s.split("\\s+"); // tách từ khi có nhiều dấu cách
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]); // in ra các từ đã tách
        }
        Arrays.sort(a); // sắp xếp mảng kí tự

           // Nếu các từ cách nhau = _, ?, !...
           s = s.replace('.', ' ');
           s = s.replace('?', ' ');
           s = s.replace('!', ' ');

           // C2: Sử dụng lớp StringTokenizer
           String s = "ngon ngu lap trinh";
           StringTokenizer st = new StringTokenizer(s); // lấy nội dung từ s
           ArrayList<String> arr = new ArrayList<>();
           while(st.hasMoreToken()){  // check xem st còn token nào ko
              System.out.println(st.nextToken());
              arr.ad(s.nextToken());
           }
           HashSet<String> set = new Hashset<>();
           for (String x: arr){
              set.add(x);
           }
           System.out.println(set.size());
    }
}
