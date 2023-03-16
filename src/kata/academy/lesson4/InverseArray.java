package kata.academy.lesson4;

// 4.1.6 Кодовая задача «Инверсия массива»

import java.util.Arrays;

class InverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

    public static int[] inverseArray(int[] numbers) {
        int[] reverseArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverseArr[i] = numbers[numbers.length - 1 - i];
        }
        return reverseArr;
    }
}