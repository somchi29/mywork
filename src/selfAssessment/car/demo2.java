package selfAssessment.car;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 10;
        int largest = Integer.max(10,0);

        for (counter = 1; counter <= 10 ; counter++) {
            System.out.println(largest);

            if (counter >= 10){
                System.out.println("largest = " + largest);

            }
        }
    }
}
