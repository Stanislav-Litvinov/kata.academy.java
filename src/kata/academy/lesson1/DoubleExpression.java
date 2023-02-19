package kata.academy.lesson1;

public class DoubleExpression {
    public static void main(String[] args) {
        System.out.println("Return 'true' if (a + b) == c: " + doubleExpression(4, 2, 6));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return (a + b) == c;
    }
}
