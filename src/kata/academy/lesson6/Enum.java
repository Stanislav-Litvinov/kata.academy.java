package kata.academy.lesson6;

// 2.1.6 Практическое задание «Работа с Enum»

class Enum {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY.isWeekend() + " " + Day.MONDAY.getRusName());
        System.out.println(Day.SATURDAY.isWeekend() + " " + Day.SATURDAY.getRusName());
        System.out.println(Day.SUNDAY.isWeekend() + " " + Day.SUNDAY.getRusName());


    }

    enum Day {
        MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"),
        SATURDAY("Суббота"), SUNDAY("Воскресенье");
        private String days;

        Day(String days) {
            this.days = days;
        }

        public String getRusName() {
            return days;
        }

        public boolean isWeekend() {
            return days.equals(SATURDAY.days) || days.equals(SUNDAY.days);
        }
    }
}