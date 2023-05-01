package academy.kata.lesson7;

// 3.1.4 Практическое задание Метод testExp()

public class ExceptionEx {
    public static void main(String[] args) throws MyNewException {
        testEx(-1);
    }

    public static void testEx(int a) {
        try {
            if (a < 0 || a > 10) {
                throw new MyNewException();
            }
        } catch (MyNewException e) {
            System.err.println("Number should be between 0 and 10");
        } finally {
            System.out.println("Your number is " + a);
        }
    }
}