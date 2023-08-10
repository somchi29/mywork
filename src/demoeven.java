public class demoeven {
    public static void main(String[] args) {
//        created an array
        int[] array = {2, 7, 8, 9};
//        added it
        int total = 0;
//        looped through
        for (int counter = 0; counter < array.length; counter++) {
//            if statements
            if (array[counter] % 2 ==0){
                total += array[counter];

            }

        }
        System.out.println(total);
    }
    }
