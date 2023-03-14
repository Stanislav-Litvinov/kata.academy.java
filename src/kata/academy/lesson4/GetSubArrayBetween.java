package kata.academy.lesson4;

// 4.1.4 Кодовая задача «Взятие части массива»

import java.util.Arrays;

class GetSubArrayBetween {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSubArrayBetween((new int[]{1, 3, 5, 6, 9, 11, 24}), 4, 10)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int[] arrBetween = new int[numbers.length];
        int count = 0;
        for (int num : numbers) {
            if (num >= start && num <= end) {
                arrBetween[count] = num;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(arrBetween, 0, result, 0, count);
        return result;
    }
}
