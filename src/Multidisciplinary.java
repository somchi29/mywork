public class Multidisciplinary {
    public static void main(String[] args) {
        String[][] score = new String[][]{{"x", "o", "x"}, {"o", "o", "x"}, {"o", "x", "x"}};
        for (String[] strings : score) {
            for (int i = 0; i < score.length; i++) {
                System.out.print(strings[i] + " ");
            }
            System.out.println();


        }

    }
}

