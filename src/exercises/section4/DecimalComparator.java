package exercises.section4;

/**
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 *
 * The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 *
 *
 * EXAMPLES OF INPUT/OUTPUT:
 *
 * * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
 *
 * * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
 *
 * * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
 *
 * * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
 *
 *
 * TIP: Use paper and pencil.
 *
 * TIP: Use casting.
 *
 * NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a  main method to solution code.
 *
 */


public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        String[] s1 = String.valueOf(num1).split("\\.");
        String[] s2 = String.valueOf(num2).split("\\.");

        String decimalPartNum1 = s1[1];
        String decimalPartNum2 = s2[1];

        if (decimalPartNum1.length() > 3) {
            decimalPartNum1 = decimalPartNum1.substring(0, 3);
        }

        if (decimalPartNum2.length() > 3) {
            decimalPartNum2 = decimalPartNum2.substring(0, 3);
        }

        return Double.valueOf(s1[0] + "." + decimalPartNum1).equals(Double.valueOf(s2[0] + "." + decimalPartNum2));
    }
}
