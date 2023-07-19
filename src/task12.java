import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize a varable
        int counter = 0, score = 10;
        int sum = 0;
        System.out.println("Enter a score : ");
        //whileloop
        while (counter < 10) {
            //concatinate
            sum += input.nextInt();
            score = sum + sum;
           counter++;
        }
        System.out.println("The sum is :" + sum);

    }

}