package kata.academy.lesson4;

// 4.1.13. Кодовая задача «Работа с массивами и условными операторами»

import java.util.StringJoiner;

class PrintOddNumbers {
    public static void main(String[] args) {
        printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 100});
        printOddNumbers(new int[]{3});
        printOddNumbers(new int[]{-3, 1, 3, 0});
        printOddNumbers(new int[]{});
    }

    public static void printOddNumbers(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(",");
        for (int i : arr) {
            if (i % 2 != 0) {
                stringJoiner.add("" + i);
            }
        }
        System.out.println(stringJoiner);
    }
}