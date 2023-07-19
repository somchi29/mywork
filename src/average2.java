import java.util.Scanner;
public class average2 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter a Score: ");
                int average = 10;
                int sum = 0;
                int score = 100;

                for (int number = 0; number < 10; number += 1) {
                    sum += input.nextInt();
                    average = sum / average;
                    System.out.println(average);
                }

            }
        }


