import java.text.BreakIterator;
import java.util.Scanner;

public class My_pratice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of point : ");
        int numberofpoint = input.nextInt();
        double[][] points = new double[numberofpoint][2];

        System.out.println("enter " + numberofpoint + "points: ");

        for (int ice = 0; ice <= points.length; ice++) {
            points[ice][0] = input.nextDouble();
            points[ice][1] = input.nextDouble();
        }

    }
}

