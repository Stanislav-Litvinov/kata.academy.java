package kata.academy.lesson4;

// 4.1.5 Кодовая задача «Вернуть середину массива»

class GetArrayMiddle {

    public static void main(String[] args) {
        getArrayMiddle(new int[]{1, 5, 2, 17});
        getArrayMiddle(new int[]{14, 16, 3});
        getArrayMiddle(new int[]{});
    }

    public static void getArrayMiddle(int[] numbers) {
        int[] middleValue;
        if (numbers.length == 0) {
            System.out.println("[]");
        } else if (numbers.length % 2 == 0) {
            middleValue = new int[2];
            middleValue[0] = numbers[(numbers.length / 2) - 1];
            middleValue[1] = numbers[numbers.length / 2];
            System.out.println("[" + middleValue[0] + ", " + middleValue[1] + "]");
        } else {
            middleValue = new int[1];
            middleValue[0] = numbers[numbers.length / 2];
            System.out.println("[" + middleValue[0] + "]");
        }
    }
}

