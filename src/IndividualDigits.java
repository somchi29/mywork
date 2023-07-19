import java.util.Scanner;

public class IndividualDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five integers");
        int me = scan.nextInt();

        int lastNumber = me / 10 % 10;
        int fourthNumber = me / 10 % 10;
        int thirdNumber = me / 100 % 10;
        int secondNumber = me / 1000 % 10;
        int firstNumber = me / 10000 % 10;
        System.out.print(firstNumber + "   " + secondNumber + "   " + thirdNumber + "   " + fourthNumber + "   " + lastNumber + "   ");

    }

}