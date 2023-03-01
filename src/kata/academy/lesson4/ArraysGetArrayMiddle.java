package kata.academy.lesson4;

//  4.1.10.  Кодовая задача «Вернуть середину c помощью Arrays»

import java.util.Arrays;

class ArraysGetArrayMiddle {
    public static void main(String[] args) {
        getArrayMiddle(new int[]{1, 5, 2, 3, 2, 17});
        getArrayMiddle(new int[]{14, 16, 3});
        getArrayMiddle(new int[]{});
    }

    public static void getArrayMiddle(int[] numbers) {
        int[] middleValue;
        if (numbers.length == 0) {
            System.out.println(Arrays.toString(numbers));
        } else if (numbers.length % 2 == 0) {
            middleValue = new int[2];
            int[] copy = new int[middleValue.length];
            middleValue[0] = numbers[(numbers.length / 2) - 1];
            middleValue[1] = numbers[numbers.length / 2];
            System.arraycopy(numbers, middleValue[0], copy, 0, middleValue.length);
            System.out.println(Arrays.toString(copy));
        } else {
            middleValue = new int[1];
            middleValue[0] = numbers[numbers.length / 2];
            System.out.println(Arrays.toString(middleValue));
        }
    }
}