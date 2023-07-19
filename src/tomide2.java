import java.util.Scanner;

public class tomide2 {
    public static void main(String[] args) {
        double price = 0;
        double weight = 1;
        Scanner input = new Scanner(System.in);
        weight = input.nextDouble();
        System.out.print("Enter weight and price for package1: " );
        while(price < 1){
            System.out.println("Enter weight and price for package2: ");
            price = weight / (price * price);


            System.out.printf("%s ", weight, price);


        }


    }
}












