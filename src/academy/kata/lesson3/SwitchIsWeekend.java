package kata.academy.lesson3;

// 3.1.10 Кодовая задача «Метод Switch»

class SwitchIsWeekend {
    public static void main(String[] args) {
        System.out.println(isWeekend(2));
        System.out.println(isWeekend(6));
    }

    public static boolean isWeekend(int weekDayNumber) {
        return switch (weekDayNumber) {
            case 1, 2, 3, 4, 5 -> false;
            case 6, 7 -> true;
            default ->
                    throw new IllegalStateException("Should be values from 1 to 7. Unexpected value: " + weekDayNumber);
        };
    }
}