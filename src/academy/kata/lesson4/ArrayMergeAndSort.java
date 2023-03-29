package kata.academy.lesson4;

// 4.1.11.  Кодовая задача «Слияние массивов c помощью Arrays»

import java.util.Arrays;

class ArrayMergeAndSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{-8, 4, 2, 4})));
        System.out.println(Arrays.toString(mergeAndSort(new int[]{}, new int[]{1, 4, 3})));
        System.out.println(Arrays.toString(mergeAndSort(new int[]{}, new int[]{})));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newArr = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArr, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArr, firstArray.length, secondArray.length);
        Arrays.sort(newArr);
        return newArr;
    }
}