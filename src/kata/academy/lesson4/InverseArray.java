package kata.academy.lesson4;

// 4.1.6 Кодовая задача «Инверсия массива»

import java.util.Arrays;

class InverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

    public static int[] inverseArray(int[] numbers) {
        int[] reverse = new int[numbers.length];
        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[count] = numbers[i];
            count++;
        }
        int[] result = new int[count];
        System.arraycopy(reverse, 0, result, 0, count);
        return result;
    }
}