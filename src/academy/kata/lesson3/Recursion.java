package kata.academy.lesson3;

// 3.1.8. Кодовая задача «Вычисление с рекурсией»

import java.math.BigInteger;

class Recursion {
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static void main(String[] args) {
        System.out.printf("Факториал числа %d равен %d \n", 0, factorial(0));
        System.out.printf("Факториал числа %d равен %d \n", 1, factorial(1));
        System.out.printf("Факториал числа %d равен %d \n", 3, factorial(3));
        System.out.printf("Факториал числа %d равен %d \n", 19, factorial(19));
        System.out.printf("Факториал числа %d равен %d \n", 25, factorial(25));
    }
}
