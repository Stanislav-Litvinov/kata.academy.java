package kata.academy.lesson3;

// 3.1.12 Кодовая задача «Тернарный оператор»

import java.util.Objects;

class CheckWeekend {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Monday"));
        System.out.println(checkWeekend("Tuesday"));
        System.out.println(checkWeekend("Wednesday"));
        System.out.println(checkWeekend("Thursday"));
        System.out.println(checkWeekend("Friday"));
        System.out.println(checkWeekend("Saturday"));
        System.out.println(checkWeekend("Sunday"));
    }

    public static String checkWeekend(String weekday) {
        String saturday = "Saturday";
        String sunday = "Sunday";
        return Objects.equals(weekday, sunday) ? "Ура, выходной!" :
                Objects.equals(weekday, saturday) ? "Ура, выходной!" : "Надо еще поработать";
    }
}