package kata.academy.lesson1;

// 2.1.7. Кодовая задача «Арифметические операции»

public class PriceCalculation {
    public static void main(String[] args) {
        System.out.println("Total price: " + priceCalculation(8.50, 2));
    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }
}
