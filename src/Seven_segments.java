public class Seven_segments {
    public static void main(String[] args) {
        String[][] score = new String[][]{
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"}, 
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
        };
        for (int strings = 0; strings < score.length; strings++) {
            for (int i = 1; i < strings; i++) {
                int j;
                for (j = 0; j < score.length; j++) {
                    int k;
                    for (k = 1; k < score.length; k++) {


                    }
                    if (score[j][i].equals("x")) score[j][i] = " ";
                    System.out.print(score[j][j] + "  ");
                }
                System.out.println();

            }

        }
    }
}



//import java.util.Scanner;
//
//public class Seven_segments {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        switch (n) {
//            case 0:
//                System.out.println("-\n  || \n  ||");
//
//
//        }
//    }
//}










