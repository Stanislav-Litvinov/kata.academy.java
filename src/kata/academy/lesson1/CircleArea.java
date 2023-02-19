package kata.academy.lesson1;

import java.text.DecimalFormat;

public class CircleArea {
    public static void main(String[] args) {
        calcCircleRaduis(10);
    }

    public static void calcCircleRaduis(double area) {
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.printf("Радиус окружности по заданной площади равен: "
                + df.format(Math.sqrt(area / Math.PI)));
    }
}
