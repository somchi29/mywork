import java.util.Scanner;

public class Students_grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" How many students do you have : " );
        int studentNumber = input.nextInt();

        System.out.print("how many subjects do they offer: ");
        int studentSubjects = input.nextInt();

        System.out.println("saving >>>>>>>>>>>>>>>>>>>");
        System.out.println("saved successfully :) ");

        int [] numberOfStudents = new int[studentNumber];
        int [][] number = new int[studentSubjects][studentNumber];

        for (int i = 0 ; i < studentSubjects; i++) {
            System.out.println(i);

        }




    }
}
