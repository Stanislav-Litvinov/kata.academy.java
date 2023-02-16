package kata.academy.lesson1;

public class ValueTypes {
    public static void main(String[] args) {
        byte varbyte = -128;
        short varshort = 32767;
        int varint = -2147483648;
        long varlong = 9_223_372_036_854_775_807L;
        float varfloat = -3.45678910111213141516f;
        double vardouble = 1.7976931348623157;
        char varchar = 36;

        System.out.println("var byte = " + varbyte);
        System.out.println("var short = " + varshort);
        System.out.println("var int = " + varint);
        System.out.println("var long = " + varlong);
        System.out.println("var float = " + varfloat);
        System.out.println("var double = " + vardouble);
        System.out.println("var char = " + varchar);
    }
}