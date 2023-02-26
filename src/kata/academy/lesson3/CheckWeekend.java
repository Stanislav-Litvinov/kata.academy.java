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
        System.out.println(checkWeekend("Понедельник"));
    }

    public static String checkWeekend(String weekday) {
        String days = weekday.toLowerCase();
        return Objects.equals(days, "monday") ? "Надо еще поработать" :
                Objects.equals(days, "tuesday") ? "Надо еще поработать" :
                        Objects.equals(days, "wednesday") ? "Надо еще поработать" :
                                Objects.equals(days, "thursday") ? "Надо еще поработать" :
                                        Objects.equals(days, "friday") ? "Надо еще поработать" :
                                                Objects.equals(days, "saturday") ? "Ура, выходной!" :
                                                        Objects.equals(days, "sunday") ? "Ура, выходной!" :
                                                                "Wrong day of week";
    }
}