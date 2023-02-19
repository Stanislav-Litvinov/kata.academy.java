package kata.academy.lesson1;

public class PriceCalculation {
    public static void main(String[] args) {
        System.out.println("Total price: " + priceCalculation(8.50, 2));
    }

    public static int priceCalculation(double price, int count) {
        return (int) (price * count);
    }
}
