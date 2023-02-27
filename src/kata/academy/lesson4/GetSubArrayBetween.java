package kata.academy.lesson4;

// 4.1.4 Кодовая задача «Взятие части массива»

class GetSubArrayBetween {
    public static void main(String[] args) {
        getSubArrayBetween((new int[]{1, 3, 5, 6, 9, 11, 24}), 4, 10);
    }

    public static void getSubArrayBetween(int[] numbers, int start, int end) {
        System.out.print("[");
        String separator = "";
        for (int number : numbers) {
            if (number >= start && number <= end) {
                System.out.print(separator);
                System.out.print(number);
                separator = ",";
            }
        }
        System.out.println("]");
    }
}