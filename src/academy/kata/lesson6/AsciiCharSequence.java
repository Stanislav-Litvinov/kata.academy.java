package academy.kata.lesson6;

// 2.5.6 Практическое задание

import java.lang.reflect.Array;

public class AsciiCharSequence implements CharSequence {

    private final byte[] x;

    AsciiCharSequence(byte[] x) {
        this.x = x;
    }

    public static void main(String[] args) {
        byte[] x = new byte[]{65, 66, 67, 68, 69, 70, 71};
        AsciiCharSequence newX = new AsciiCharSequence(x);
        System.out.println(newX.length()); //7
        System.out.println(newX.charAt(3)); //D
        System.out.println(newX.subSequence(3, 5)); //DE
        System.out.println(newX.toString()); //ABCDEFG
    }

    @Override
    public int length() {
        return Array.getLength(x);
    }

    @Override
    public char charAt(int index) {
        return toString().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(start, end);
    }

    @Override
    public String toString() {
        return new String(this.x);
    }
}
