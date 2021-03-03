package exercises.section5;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * <p>
 * The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
 * <p>
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * <p>
 * Example input/output
 * <p>
 * * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * <p>
 * * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * <p>
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
 * <p>
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
 * <p>
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * <p>
 * <p>
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static like we have been doing so far in the course.
 * <p>
 * NOTE: Do not add a  main method to solution code.
 */
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return number * 2;
        }

        int lastDigit = -1;
        int firstDigit = 0;

        while (number != 0) {
            if (lastDigit == -1) {
                lastDigit = number % 10;
                number /= 10;
                continue;
            }

            firstDigit = number;
            number /= 10;

        }

        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));// → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        System.out.println(sumFirstAndLastDigit(257));// → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        System.out.println(sumFirstAndLastDigit(0));// → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        System.out.println(sumFirstAndLastDigit(5));// → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        System.out.println(sumFirstAndLastDigit(-10));// → should return -1, since the parameter is negative and needs to be positive.
    }
}
