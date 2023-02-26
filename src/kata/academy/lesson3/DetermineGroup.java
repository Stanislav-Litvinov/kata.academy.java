package kata.academy.lesson3;

// 3.1.9. Кодовая задача «Метод определение группы с условным оператором»
// Группы: первая — от 7 до 13 лет, вторая — от 14 до 17 лет, третья — от 18 до 65 лет.

public class DetermineGroup {
    public static void main(String[] args) {
        DetermineGroup group = new DetermineGroup();
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 6, group.determineGroup(6));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 7, group.determineGroup(7));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 8, group.determineGroup(8));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 12, group.determineGroup(12));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 13, group.determineGroup(13));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 14, group.determineGroup(14));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 15, group.determineGroup(15));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 16, group.determineGroup(16));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 17, group.determineGroup(17));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 18, group.determineGroup(18));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 19, group.determineGroup(19));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 64, group.determineGroup(64));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 65, group.determineGroup(65));
        System.out.printf("Ваш возраст %d ваша группа: %d \n", 66, group.determineGroup(66));
    }

    public int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        } else return -1;
    }
}