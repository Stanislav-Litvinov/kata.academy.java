package kata.academy.lesson4;

// 4.1.7 Кодовая задача «Сортировка массива»

class MergeAndSort {
    public static void main(String[] args) {
        mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4});
        mergeAndSort(new int[]{}, new int[]{1, 4, 3});
        mergeAndSort(new int[]{}, new int[]{});
    }

    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        // объеденяяем два массива в один
        int[] newArr = new int[firstArray.length + secondArray.length];
        int count = 0;

        for (int i = 0; i < firstArray.length; i++) {
            newArr[i] = firstArray[i];
            count++;
        }

        for (int i : secondArray) {
            newArr[count++] = i;
        }

        // сортируем
        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length - i - 1; j++) {
                if (newArr[j + 1] < newArr[j]) {
                    int tmp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = tmp;
                }
            }
        }

        //выводим на экран
        System.out.print("[");
        String separator = "";
        for (int arr : newArr) {
            System.out.print(separator);
            System.out.print(arr);
            separator = ",";
        }
        System.out.println("]");
    }
}
