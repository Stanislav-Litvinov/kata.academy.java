package kata.academy.lesson1_2;

// 2.2.8. Кодовая задача «Метод isPowerOfTwo»

class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Input example 0 = false: " + isPowerOfTwo(0));
        System.out.println("Input example 1 = true: " + isPowerOfTwo(1));
        System.out.println("Input example -2 = true: " + isPowerOfTwo(-2));
        System.out.println("Input example 22 = false: " + isPowerOfTwo(22));
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return (value != 0) && ((value & (value - 1)) == 0);
    }
}
