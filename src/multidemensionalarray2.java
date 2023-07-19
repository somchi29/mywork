public class multidemensionalarray2 {
    public static void main(String[] args) {
        String[][] score = new String[][]{{"x","o","x"},{"o","o","x"},{"o","x","x"}};
        for (int strings = 0; strings < score.length; strings++) {
            for (int i = 0; i < score.length; i++) {
                if(score[strings][i].equals("x")) score[strings][i] = "1";
                System.out.print(score[strings][i] + " ");
            }
            System.out.println();


        }

    }
}
