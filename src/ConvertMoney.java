import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap usd");
        usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println("So tien usd la: "+ convert);

    }
}
