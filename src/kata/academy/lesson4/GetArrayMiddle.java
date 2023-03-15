package kata.academy.lesson4;

// 4.1.5 Кодовая задача «Вернуть середину массива»

import java.util.Arrays;

class GetArrayMiddle {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 5, 2, 17})));
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{14, 16, 3})));
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{})));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int[] middleValue;
        if (numbers.length == 0) {
            return numbers;
        }
        if (numbers.length % 2 == 0) {
            middleValue = new int[]{numbers[(numbers.length / 2) - 1], numbers[numbers.length / 2]};
        } else {
            middleValue = new int[]{numbers[numbers.length / 2]};
        }
        return middleValue;
    }
}
