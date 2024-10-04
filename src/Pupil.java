public class Pupil extends Student {
    private String fatherName;

    public Pupil(String fatherName, String lop, double gpa, String name, String birth) {
        super(lop, gpa, name, birth);
        this.fatherName = fatherName;
    }    
}
