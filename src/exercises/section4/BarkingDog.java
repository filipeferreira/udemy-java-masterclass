package exercises.section4;

/**
 * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
 * <p>
 * Write a method shouldWakeUp that has 2 parameters.
 * <p>
 * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
 * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
 * <p>
 * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
 * <p>
 * In all other cases return false.
 * <p>
 * If the hourOfDay parameter is less than 0 or greater than 23 return false.
 * <p>
 * Examples of input/output:
 * <p>
 * * shouldWakeUp (true, 1); → should return true
 * <p>
 * * shouldWakeUp (false, 2); → should return false since the dog is not barking.
 * <p>
 * * shouldWakeUp (true, 8); → should return false, since it's not before 8.
 * <p>
 * * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.
 * <p>
 * <p>
 * TIP: Use the if else statement with multiple conditions.
 * <p>
 * NOTE: The shouldWakeUp method  needs to be defined as public static like we have been doing so far in the course.
 * <p>
 * NOTE: Do not add a  main method to solution code.
 */
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && ( (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23) )) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); //→should return true
        System.out.println(shouldWakeUp(false, 2)); //→should return false since the dog is not barking.
        System.out.println(shouldWakeUp(true, 8)); //→should return false,since it 's not before 8.
        System.out.println(shouldWakeUp(true, -1)); //→should return false since the hourOfDay parameter needs to be in a range
                                                                    //0 - 23.
    }

}
