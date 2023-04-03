import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.println("Nhap a");
        a = sc.nextFloat();
        System.out.println("Nhap b");
        b = sc.nextFloat();

        if(a!=0){
            float x = (-b)/a;
            System.out.println(x);
        }else if(b!=0){
            System.out.println("VO NGHIEM");
        }else {
            System.out.println("VO SO NGHIEM");

        }
    }
}
