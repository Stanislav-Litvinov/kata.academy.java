package kata.academy.lesson6;

// 2.2.10.   Практическое задание «Переиспользование методов»

class OverridingMethods {
    public static void main(String[] args) {
        String[] week = {"Monday", "Sunday", "saturday", "Wednesday", "FRIDAY"};
        System.out.println(Day.isWeekend("Sunday")); //true
        System.out.println(Day.weekendCount(week)); //2
        System.out.println(WorkDay.weekendCount(week)); //3
    }

    static class Day {
        static int count = 0;

        public static boolean isWeekend(String dayName) {
            return dayName.equalsIgnoreCase("sunday") || dayName.equalsIgnoreCase("saturday");
        }

        public static int weekendCount(String[] days) {
            for (String day : days) {
                if (isWeekend(day)) {
                    count++;
                }
            }
            return count;
        }
    }

    static class WorkDay extends Day {
        public static int weekendCount(String[] days) {
            for (String day : days) {
                if (!isWeekend(day)) {
                    count++;
                }
            }
            return count;
        }
    }
}