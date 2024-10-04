import java.util.Scanner;

public class Main_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble(), y1 =sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double a = p1.distance(p2), b=p2.distance(p3), c=p3.distance(p1);
            if(a+b>c && b+c>a && a+c>b){
                double p = (a+b+c)/2;
                double s = Math.sqrt((a+b+c) *(a+b-c)*(b+c-a)*(c+a-b)) *1/4;
                double R = a*b*c / (4*s);
                System.out.printf("%.3f",Math.PI * R * R);
            }
            else{
                System.out.println("INVALID");
            }
            System.out.println();
        }
    }
}
