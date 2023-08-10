public class scaletMinimum {
    public static void main(String[] args) {
        int firstNumber = 10000;
        int secondNumber = 440;
        int thirdNumber = 150;
        int fourthNumber = 260;
        int largestNumber = secondNumber;

        if (firstNumber > largestNumber) {
            largestNumber = firstNumber;
        }
        if (thirdNumber > largestNumber){
            largestNumber = thirdNumber;
        }
        if (fourthNumber > largestNumber){
            largestNumber = fourthNumber;
        }
        System.out.println("the largest number is : " + largestNumber);
    }
}
