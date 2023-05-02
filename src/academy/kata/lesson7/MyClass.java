package academy.kata.lesson7;

// 3.1.4 Практическое задание Метод testExp()


class MyNewException extends Exception {
    public MyNewException(String message) {
        super(message);
    }
}

public class MyClass {
    public static void testExp(int num) throws MyNewException {
        if (num < 1 || num > 9) {
            throw new MyNewException("Number should be between 1 and 9");
        }
        // Далее следует код, который будет выполнен, если аргумент находится в нужном диапазоне
    }
}