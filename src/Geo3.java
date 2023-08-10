import java.util.Scanner;

import static java.lang.System.*;

public class Geo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.println("Enter a state: ");
        String input = scan.next();
        out.println(GeoPoliticalZone.zones(input));


    }
}





