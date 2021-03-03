package primitives;

public class Casting {

    public static void main(String[] args) {
        byte minByteValue = Byte.MIN_VALUE;

        //tem que fazer cast pois o Java assume
        byte byteValue = (byte) (minByteValue / 2);
    }
}
