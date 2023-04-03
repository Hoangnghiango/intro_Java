import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println( "Enter weight:");
        weight = sc.nextDouble();
        System.out.println("Enter height:");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height, 2);
        if(bmi<18.5){
            System.out.println(bmi+ " Underweight");
        }else if(bmi<25){
            System.out.println(" Normal");
        }else if (bmi<30){
            System.out.println(bmi+ "Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
