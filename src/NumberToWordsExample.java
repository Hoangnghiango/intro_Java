import java.util.Scanner;

public class NumberToWordsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số co ba chu so: ");
        int number = scanner.nextInt();
        String result ="";
        int hundreds = number/100;
        int tens = (number/10)%10;
        int ones = number%10;
        if(hundreds>0 && hundreds<=9){
            switch(hundreds){
                case 1:
                    result+="Mot tram";
                    break;
                case 2:
                    result+="Hai tram";
                    break;
                case 3:
                    result+="Ba Tram";
                    break;
                case 4:
                    result+="Bon Tram";
                    break;
                case 5:
                    result+="Nam Tram";
                    break;
                case 6:
                    result+="Sau Tram";
                    break;
                case 7:
                    result+="Bay Tram";
                    break;
                case 8:
                    result+="Tam Tram";
                    break;
                case 9:
                    result+="Chin Tram";
                    break;

            }
        }
        if(tens==0 && ones==0){
                result+="";
        }else {


            switch (tens) {
                case 0:
                    result += " le";
                    break;
                case 1:
                    result += " Muoi";
                    break;
                case 2:
                    result += " Hai muoi";
                    break;
                case 3:
                    result += " Ba Muoi";
                    break;
                case 4:
                    result += " Bon Muoi";
                    break;
                case 5:
                    result += " Nam muoi";
                    break;
                case 6:
                    result += " Sau muoi";
                    break;

                case 7:
                    result += " Bay muoi";
                    break;
                case 8:
                    result += " Tam muoi";
                    break;
                case 9:
                    result += " Chin muoi";
                    break;

            }
            switch (ones) {
                case 1:
                    result += " Mot";
                    break;
                case 2:
                    result += " Hai";
                    break;
                case 3:
                    result += " Ba";
                    break;
                case 4:
                    result += " Bon";
                    break;
                case 5:
                    result += " Nam";
                    break;
                case 6:
                    result += " Sau";
                    break;
                case 7:
                    result += " Bay";
                    break;
                case 8:
                    result += " Tam";
                    break;
                case 9:
                    result += " Chin";
                    break;


            }
        }
        System.out.println(result);





    }
}
