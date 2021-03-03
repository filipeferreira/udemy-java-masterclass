package primitives;

public class OverflowAndUnderflow {

    public static void main(String[] args) {
        System.out.println("INTEGER MAX_VALUE " + Integer.MIN_VALUE);
        System.out.println("INTEGER MIN_VALUE " + Integer.MAX_VALUE);

        /*
        underflow => vai para o maior número
         */
        System.out.println("INTEGER MIN_VALUE - 1 = " + (Integer.MIN_VALUE -1));

        /*
        overflow => volta para o menor número
         */
        System.out.println("INTEGER MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1));

        long longValue = 100L;


    }
}
