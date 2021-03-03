package exercises.section5;

/**
 * Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
 * <p>
 * Check that number is > 0, if it is not return false.
 * <p>
 * If number is odd return true, otherwise  return false.
 * <p>
 * Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
 * <p>
 * The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
 * <p>
 * It should call the method isOdd to check if each number is odd.
 * <p>
 * The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
 * <p>
 * If those conditions are not satisfied return -1 from the method to indicate invalid input.
 * <p>
 * Example input/output:
 * <p>
 * * sumOdd(1, 100); → should return 2500
 * <p>
 * * sumOdd(-1, 100); →  should return -1
 * <p>
 * * sumOdd(100, 100); → should return 0
 * <p>
 * * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
 * <p>
 * * sumOdd(100, -100); → should return -1
 * <p>
 * * sumOdd(100, 1000); → should return 247500
 * <p>
 * <p>
 * TIP: use the remainder operator to check if the number is odd
 * <p>
 * NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a  main method to solution code.
 */

public class SumOddRange {

    public static int sumOdd(int start, int end) {
        if (end < start || end <= 0 || start <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            return number % 2 > 0;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); //should return 2500
        System.out.println(sumOdd(-1, 100));//  should return -1
        System.out.println(sumOdd(100, 100));// should return 0
        System.out.println(sumOdd(13, 13)); //should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100));// should return -1
        System.out.println(sumOdd(100, 1000));// should return 247500
    }
}
