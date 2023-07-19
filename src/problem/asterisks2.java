package problem;

public class asterisks2 {
    public static void main(String[] args) {
        for (int precious = 0; precious <= 10; precious++) {
            for (int chisom = 0; chisom <= precious; chisom++) {
                System.out.print("*");
            }
            for (int chisom = 0; chisom <= precious; chisom++) {
                System.out.print(" ");
            }
            for (int chisom = 0; chisom <= precious; chisom++) {
                System.out.print("*");
            }
            System.out.println();
            }
            for (int precious = 0; precious <= 10; precious++) {
            System.out.println(" ");
            }
            for (int chisom = 0; chisom <= 10; chisom++) {
            System.out.print("*");
        }
        System.out.println();
    }
}