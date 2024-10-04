public class OOP1 {
    // Class : Mô phỏng những thông tin chung
    // Object : 1 thực thể cụ thể của lớp
    // VD: Đối tượng của lớp Person là "Nguyễn Văn An" chính là 1 thực thể


    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        s.greet();
        SinhVien t = new SinhVien("123", "Teo", 3.5);
        s.display();
        t.display();
    }
}
