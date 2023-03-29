package kata.academy.lesson5;

// 5.1.8. Кодовая задача «Преобразование строки в число в Java»

class ParseAndSqrt {
    public static void main(String[] args) {
        System.out.println(parseAndSqrt("14213123")); //3770
    }

    public static long parseAndSqrt(String number) {
        long num = Long.parseLong(number);
        if (num < 0) {
            System.out.print("Can't be negative: ");
        } else {
            num = Math.round(Math.sqrt(num));
        }
        return num;
    }
}