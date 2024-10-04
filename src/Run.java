public class Run {
//     Khi lớp con kế thừa lớp cha, nó có đầy đủ các thuộc tính và phương thức của
// lớp cha, ngoài ra bạn có thể bổ sung thêm thuộc tính và phương thức cần thiết cho lớp con.
//     Tuy nhiên nếu các thuộc tính của lớp cha là private bạn cũng ko thể truy
// cập vào các thuộc tính này từ lớp con. Nếu muốn thì bạn khai báo phạm vi truy cập là protected.
    public static void main(String[] args) {
        Student s = new Student("CNTT4", 3.2, "Nguyen Van AN", "05/09/2004");
        System.out.println(s.getName());
        System.out.println(s);
        s.greet();
    }

    // OVERRIDING
    // Ghi đè trong kế thừa là khi ở lớp cha và lớp con có một phương thức giống nhau. 
    // Nếu lớp con không ghi đè phương thức này thì phương thức của lớp cha sẽ được gọi khi bạn gọi phương thức này từ đối tượng của lớp con.
}
