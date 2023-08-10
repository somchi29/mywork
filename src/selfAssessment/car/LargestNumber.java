package selfAssessment.car;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboardInput.nextInt();

        int largestNumber = number;

        for (int counter = 1; counter < 5; counter++) {
            if (number > largestNumber) {
              largestNumber = number ;
            }
            System.out.print("Enter a number: ");
             number = keyboardInput.nextInt();
        }
        System.out.print("The largest number is "+largestNumber);
    }
}
