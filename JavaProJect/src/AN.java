import java.util.Scanner;

public class AN {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float tong = (a+b+c*2+d*3)/7;
        if (tong >=8){
            System.out.println("GIOI");
        }
        else if (tong >=6.5){
            System.out.println("kHA");
        }
        else if (tong >=5){
            System.out.println("Trung binh");
        }
        else{
            System.out.println("YẾu");
        }
    }
}
