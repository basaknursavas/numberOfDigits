import java.util.Scanner ;

public class numberOfDigits {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int number, sumOfDigits = 0, numberCounter = 0 , digitValue ;

        System.out.print("Enter a number : ");
        number = input.nextInt();

        while(number != 0){

            digitValue = number % 10 ;
            number /= 10 ;
            numberCounter++ ;

            System.out.println("Te digits of entered number : " + digitValue);

            sumOfDigits += digitValue ;
        }
        System.out.println("The sum of digits : " + sumOfDigits);
    }
    
}
