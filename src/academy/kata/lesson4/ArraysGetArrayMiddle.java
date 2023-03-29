package kata.academy.lesson4;

//  4.1.10.  Кодовая задача «Вернуть середину c помощью Arrays»

import java.util.Arrays;

class ArraysGetArrayMiddle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 5, 2, 3, 2, 17})));
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{14, 16, 3})));
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{})));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        int middleValue = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            return Arrays.copyOfRange(numbers, middleValue - 1, middleValue + 1);
        } else {
            return Arrays.copyOfRange(numbers, middleValue, middleValue + 1);

        }
    }
}
