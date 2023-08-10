public class Creditcard {
   public static void main(String[] args) {
       int[] cardnumber = {4, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
        String neee = " ";

        for (int index = cardnumber.length - 1; index > 0; index--) {
            int another = cardnumber[index];

            neee += another;

        }
       System.out.println(neee );

 }
}
