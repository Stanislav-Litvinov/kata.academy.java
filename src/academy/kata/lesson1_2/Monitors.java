package kata.academy.lesson1_2;

// 2.1.6. Кодовая задача «Арифметические вычисления»

public class Monitors {
    public static void main(String[] args) {
        drawisMonitorsCounter(63, 5);
    }

    public static void drawisMonitorsCounter(int monitors, int programmers) {
        System.out.println("Monitors left: " + monitors % programmers);
    }
}
