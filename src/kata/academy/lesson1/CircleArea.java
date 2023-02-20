package kata.academy.lesson1;

// 2.1.12 Кодовая задача «Вычисление радиуса окружности»

public class CircleArea {
    public static void main(String[] args) {
        calcCircleRaduis(10);
    }

    public static void calcCircleRaduis(double area) {
        System.out.println("Радиус окружности по заданной площади равен:");
        System.out.printf("%.3f", Math.sqrt(area / Math.PI));
    }
}
