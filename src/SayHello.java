import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten vao ban phim: ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);
    }
}
