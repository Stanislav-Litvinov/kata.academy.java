package kata.academy.lesson5;

// 5.1.8. Кодовая задача «Преобразование строки в число в Java»

class ParseAndSqrt {
    public static void main(String[] args) {
        parseAndSqrt("14213123"); //3770
        parseAndSqrt("64"); //8
        parseAndSqrt("5"); //2
        parseAndSqrt("1"); //1
        parseAndSqrt("0"); //0
        parseAndSqrt("-1"); //sqrt can't be negative
    }

    public static void parseAndSqrt(String number) {
        long num = Long.parseLong(number);
        if (num < 0) {
            System.out.println("sqrt can't be negative");
        } else if (num == 0 || num == 1) {
            System.out.println(num);
        } else {
            System.out.println(Math.round(Math.sqrt(num)));
        }
    }
}
