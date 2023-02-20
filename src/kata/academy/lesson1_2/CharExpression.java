package kata.academy.lesson1_2;

// 2.2.2. Кодовая задача «Преобразование базовых типов данных»

class CharExpression {
    public static void main(String[] args) {

        System.out.println(charExpression(20));
    }

    public static char charExpression(int a) {
        char ch = '\\';
        return (char) (a + ch);
    }
}
