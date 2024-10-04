public class Student extends Person {
    private String lop;
    private double gpa;

    // lớp con bắt buộc phải có hàm tạo vì Lớp Cha trc -> lớp con
    public Student(String lop, double gpa, String name, String birth){
        super(name, birth); // Để gọi các phương thức của lớp cha tại lớp con
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString(){
        return super.toString() + " " + this.lop +" "+ String.format("%.2f", gpa);
        // gọi Pthuc toString của lớp cha
        // Hay this.name + " "+ this.birth +... vì đã khai báo protected.
    }

    public void greet(){
        System.out.println("Ham greet cua lop con student");
    }
}
