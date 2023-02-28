package kata.academy.lesson4;

// 4.1.6 Кодовая задача «Инверсия массива»

class InverseArray {
    public static void main(String[] args) {
        inverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    public static void inverseArray(int[] numbers) {
        System.out.print("[");
        String separator = "";
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(separator);
            System.out.print(numbers[i]);
            separator = ", ";
        }
        System.out.print("]");
    }
}