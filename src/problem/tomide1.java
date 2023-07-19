package problem;

import java.util.Scanner;

public class tomide1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        int celsius = input.nextInt();
        double fahrenheit = ((double) 9 / 5) * celsius + 32;


        System.out.printf("%s celsius is, %s Fahrenheit  ",celsius, fahrenheit );



    }
}
