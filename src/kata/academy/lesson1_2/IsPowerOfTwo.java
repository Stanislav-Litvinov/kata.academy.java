package kata.academy.lesson1_2;

// 2.2.8. Кодовая задача «Метод isPowerOfTwo»

class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }

    public static boolean isPowerOfTwo(int value) {
        return Math.abs(value % 2) == 0;
    }
}
