package kata.academy.lesson3;

import java.math.BigInteger;

// 3.1.7.  Кодовая задача «Вычисление факториала заданного натурального числа»

class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= value; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.printf("Факториал числа %d равен %d \n", 0, factorial(-0));
        System.out.printf("Факториал числа %d равен %d \n", 1, factorial(1));
        System.out.printf("Факториал числа %d равен %d \n", 3, factorial(3));
        System.out.printf("Факториал числа %d равен %d \n", 19, factorial(19));
        System.out.printf("Факториал числа %d равен %d \n", 25, factorial(25));
    }
}

