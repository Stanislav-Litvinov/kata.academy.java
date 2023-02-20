package kata.academy.lesson1;

import java.math.BigInteger;

// 2.1.13 Кодовая задача  «Получение квадрата максимального long»

public class MaxLongSqr {
    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger square = maxLong.multiply(maxLong);
        System.out.println("квадрат максимального значения, которое может содержаться в переменной long = "
                + square);
    }
}


