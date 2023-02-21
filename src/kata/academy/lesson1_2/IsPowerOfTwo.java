package kata.academy.lesson1_2;

// 2.2.8. Кодовая задача «Метод isPowerOfTwo»

class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println("First example 0 = false: " + isPowerOfTwo(0));
        System.out.println("Second example 1 = true: " + isPowerOfTwo(1));
        System.out.println("Third example -2 = true: " + isPowerOfTwo(-2));
    }

    public static boolean isPowerOfTwo(int value) {
        if (value != 0) {
            return Math.abs(value % 2) == 0 || value == 1;
        }
        return false;
    }
}
