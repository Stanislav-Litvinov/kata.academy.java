package kata.academy.lesson4;

// 4.1.3. Кодовая задача «Печать массива в консоль»

class PrintArray {
    public static void main(String[] args) {
        printArray(new int[]{});
        printArray(new int[]{1, 2, 3});
        printArray(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 7});
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        String separator = "";
        for (int number : numbers) {
            System.out.print(separator);
            System.out.print(number);
            separator = ", ";
        }
        System.out.println("]");
    }
}
