import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main_Stud_Staf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Student> arr1 = new ArrayList<>();
        ArrayList<Staff> arr2 = new ArrayList<>();
        sc.nextLine();
        sc.nextLine();
        for(int i=0; i<n; i++){
            arr1.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble()));
            sc.nextLine();
            sc.nextLine();
        }
        
        for(int i=0; i<m; i++){
            arr2.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
            sc.nextLine();
            sc.nextLine();
        }
        Collections.sort(arr1, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getFee() != o2.getFee()){
                    if (o1.getFee() > o2.getFee()){
                        return -1;
                    }
                    return 1;
                }
                else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
            
        });

        Collections.sort(arr2, new Comparator<Staff>() {

            @Override
            public int compare(Staff o1, Staff o2) {
                if(o1.getPay() != o2.getPay()){
                    if(o1.getPay() < o2.getPay()) return -1;
                    return 1;
                }
                else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
            
        });
        System.out.println("Student List : ");
        System.out.println("------------------");
        for(Student x: arr1){
            System.out.println(x);
        }
        System.out.println("Staff List : ");
        System.out.println("------------------");
        for(Staff x: arr2){
            System.out.println(x);
        }
    }
}


