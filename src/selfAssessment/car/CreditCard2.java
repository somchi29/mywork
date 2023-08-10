package selfAssessment.car;

import java.util.Scanner;

public class CreditCard2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        String creditCardNumber = scanner.next();

        String cardType = getCardType(creditCardNumber);
        boolean isValid = isValidCreditCardNumber(creditCardNumber);
        calculateIndex(creditCardNumber);

        System.out.println("Credit Card Type: " + cardType);
        System.out.println("Validity Status: " + (isValid ? "Valid" : "Invalid"));
    }

    private static String getCardType(String creditCardNumber) {
        if (creditCardNumber.startsWith("4")) {
            return "Visa";
        } else if (creditCardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (creditCardNumber.startsWith("37")) {
            return "American Express";
        } else if (creditCardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }

    private static boolean isValidCreditCardNumber(String creditCardNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int counter = creditCardNumber.length() - 1; counter >= 0; counter--) {
            int digit = Character.getNumericValue(creditCardNumber.charAt(counter));
            if (alternate) {
                digit *= 2;
                if (digit >= 9) {
                    digit = digit % 10 + 1;
                }
            }
            sum += digit;
            alternate = !alternate;
        }
        return sum % 10 == 0;
    }

    public static void calculateIndex(String creditCardNumber) {
        int counter = creditCardNumber.length();
        System.out.println("Credit card index: " + counter);
    }


}


