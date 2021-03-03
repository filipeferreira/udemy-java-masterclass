package exercises.section4;

/**
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
 * <p>
 * The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
 * <p>
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
 * <p>
 * XX represents the original value kiloBytes.
 * YY represents the calculated megabytes.
 * ZZ represents the calculated remaining kilobytes.
 * <p>
 * For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
 * <p>
 * If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
 * <p>
 * <p>
 * EXAMPLE INPUT/OUTPUT
 * <p>
 * * printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
 * <p>
 * * printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.
 * <p>
 * * printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"
 * <p>
 * <p>
 * TIP: Be extremely careful about spaces in the printed message.
 * <p>
 * TIP: Use the remainder operator
 * <p>
 * TIP: 1 MB = 1024 KB
 * <p>
 * NOTE: Do not set kilobytes parameter value inside your method.
 * <p>
 * NOTE: The solution will not be accepted if there are extra spaces.
 * NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static like we have been doing so far in the course.NOTE: Do not add a  main method to solution code.
 */

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(final int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

}

