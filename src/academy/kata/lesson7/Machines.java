package academy.kata.lesson7;

// 3.2.5 Практическое задание Практика обработки исключений в блоке catch/finally

public class Machines {
    public static void main(String[] args) {
        try (Car bmw = new Car()) {
            bmw.drive();
        } catch (Exception ignored) {
        }
    }

    static class Car implements AutoCloseable {

        public void close() {
            System.out.println("Машина закрывается...");
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }
    }
}
