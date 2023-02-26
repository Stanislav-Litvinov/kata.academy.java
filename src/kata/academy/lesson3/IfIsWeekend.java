package kata.academy.lesson3;

// 3.1.11 Кодовая задача «Метод IF/Else»

class IfIsWeekend {
    public static void main(String[] args) {
        System.out.println(isWeekend(2));
        System.out.println(isWeekend(6));
    }

    public static boolean isWeekend(int weekDayNumber) {
        return weekDayNumber == 6 || weekDayNumber == 7;
    }
}

 /* if (weekDayNumber == 6 || weekDayNumber == 7) {
            return true;
        } else return false;
    }*/
