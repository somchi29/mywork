import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average;
        while (counter < 10) {
            System.out.print("enter a score: ");
            int score = input.nextInt();
            sum = sum + score;
            counter++;
        }
        System.out.println("sum is : " + sum);
                average = (double)sum / counter;
        System.out.println("The average is:" + average);

        }
    }
