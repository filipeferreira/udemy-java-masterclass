package exercises.section5;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * 
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the
 * range, the method should return false.
 * 
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise,
 * the method should return false.
 * 
 * 
 * EXAMPLE INPUT/OUTPUT:
 * 
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * 
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * 
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * 
 * 
 * NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
 * 
 * NOTE: Do not add a main method to the solution code.
 */
public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        if (a == b) {
            return true;
        }

        int higherNumber;
        int smallerNumber;

        if (a > b) {
            higherNumber = a;
            smallerNumber = b;
        } else {
            higherNumber = b;
            smallerNumber = a;
        }

        boolean hasShared = false;
        while (higherNumber > 0 && !hasShared) {
            int lastDigitHigherNumber = higherNumber % 10;
            int other = smallerNumber;
            do {
                int lastDigitSmallerNumber = other % 10;

                if (lastDigitHigherNumber == lastDigitSmallerNumber) {
                    hasShared = true;
                    break;
                }

                other /= 10;

            } while (other > 0);

            higherNumber /= 10;
        }

        return hasShared;

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(0, 0));
        System.out.println(hasSharedDigit(10, 0));
    }
}
