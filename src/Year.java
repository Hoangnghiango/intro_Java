import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam:");
        int year;
        year = sc.nextInt();
        if(year%4 ==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Nam nhuan");
                }else {
                    System.out.println("Nam khong nhuan");
                }
            }else{
                System.out.println("Nam nhuan");
            }

        }else {
            System.out.println("Nam khong nhuan");
        }

    }
}
