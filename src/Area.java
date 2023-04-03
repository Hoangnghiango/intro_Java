import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Width:");
        width = sc.nextFloat();
        System.out.printf("Enter Height:");
        height = sc.nextFloat();
        float area = width * height;
        System.out.printf("Area is:" + area);



    }

}
