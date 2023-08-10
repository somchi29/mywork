import java.util.Scanner;

public class cryptography {
    public static void main(String[] args) {
        Integer();
    }

    public static void Integer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value  = scan.nextInt();
        int crypt = scan.nextInt();
        int firstnumber = value % 10;
        int secondnumber = value / 10;
        int thirdnumber = secondnumber % 10;
        int fourthnumber = secondnumber / 10;
        int fifthnumber = fourthnumber % 10;
        int sixthnumber = fourthnumber / 10;
        int seventhnumber = value % 10 ;

        for (int resulta = 10; resulta < value; resulta++) {
            System.out.println(seventhnumber);


        }

    }
}

























