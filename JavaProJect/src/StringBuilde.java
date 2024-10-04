public class StringBuilde {
    // Dùng để tiết kiệm bộ nhớ khi không phải tạo nhiều string để thêm, bớt, xóa
    // Làm các thao tác trc khi chuyển sang string
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("Nguyen "); // Thêm vào
        sb.append("An");
        sb.insert(7, "Van "); // chèn vào vị trí cụ thể
    
        String name = sb.toString();  // Chuyển sang xâu
        String reverseName = sb.reverse().toString();  // Đảo ngược xâu
        System.out.println(name);
        System.out.println(reverseName);

        sb.replace(0, 2, "Na"); // thay thế n kí tự từ start to end-1
        reverseName = sb.toString();
        System.out.println(reverseName);
        
    }
}
