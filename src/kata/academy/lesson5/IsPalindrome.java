package kata.academy.lesson5;

// 5.1.9. Кодовая задача «Преобразование строки в число в Java»

class IsPalindrome {
    public static void main(String[] args) {
        String palindrome = "Was it a cat I saw?";
        String wrongString = "A palindrome is a word, number, phrase, " +
                "or other sequence of characters which reads the same backward as forward, " +
                "such as madam or racecar or the number 10801.";

        System.out.println(isPalindrome(palindrome)); //true
        System.out.println(isPalindrome(wrongString)); //false
    }

    public static boolean isPalindrome(String text) {
        String strPattern = "[^a-zA-Z0-9]";
        text = text.replaceAll(strPattern, "");
        StringBuilder input1 = new StringBuilder();
        input1.append(text);
        input1.reverse();
        return text.equalsIgnoreCase(input1.toString());
    }
}
