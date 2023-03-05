package kata.academy.lesson5;

// 5.1.10 Кодовая задача «Работа с регулярными выражениями»

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IsGmailOrOutlook {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
        System.out.println(isGmailOrOutlook("@outlook.com"));

    }

    public static boolean isGmailOrOutlook(String email) {
        String regex = "^(\\w+@(gmail.com|outlook.com))$";
        Pattern compileEmails = Pattern.compile(regex);
        Matcher validate = compileEmails.matcher(email);

        return validate.matches();
    }
}
