package chapter4;

import java.util.Scanner;

public class Addtionofnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number: ");
        int number1 = scan.nextInt();

        System.out.println("Enter a number: ");
        int number2 = scan.nextInt();

        int sum = number1 +number2;

        System.out.print("the stotal sum is " + sum);
    }
}
