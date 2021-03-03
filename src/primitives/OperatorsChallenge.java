package primitives;

public class OperatorsChallenge {

    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double result = (num1 + num2) * 100;
        double remainder = result % 40.00;
        boolean remainderZero = (remainder == 0);
        System.out.println(remainderZero);
        if (!remainderZero) {
            System.out.println("Got some reminder");
        }
    }
}
