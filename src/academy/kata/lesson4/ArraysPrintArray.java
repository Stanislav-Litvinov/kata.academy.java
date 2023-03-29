package kata.academy.lesson4;

// 4.1.9.  Кодовая задача «Вывод массива в консоль c помощью Arrays»

import java.util.Arrays;

class ArraysPrintArray {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7});
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}