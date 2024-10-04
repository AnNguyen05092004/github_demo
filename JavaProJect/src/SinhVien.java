public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private double gpa;

    public void greet() {
        System.out.println("Hello !");
    }

    // Constructor: Hàm tạo
    // xây dựng hàm tạo để nhanh chóng khởi tạo thông tin cho các thuộc tính của đối tượng bằng cách nạp chồng hàm tạo.
//     Hàm tạo không có kiểu trả về, có tên trùng với tên
// lớp, tùy theo tham số bạn truyền vào cho đối tượng
// khi khai báo thì hàm tạo phù hợp sẽ được gọi.
    SinhVien(){
        System.out.println("Ham tao khong tham so");
    }
    SinhVien(String ma, String ten, double diem){
        maSinhVien = ma;
        hoTen = ten;
        gpa = diem;
    }

    public void display(){
        System.out.println(maSinhVien + " "+ hoTen+" "+gpa);
    }
}
