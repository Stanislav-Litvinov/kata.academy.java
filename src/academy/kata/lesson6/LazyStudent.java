package academy.kata.lesson6;

// 2.4.11 Практическое задание «Наследование»

public class LazyStudent extends Student {
    public LazyStudent() {
        super("");
    }

    @Override
    public void study() {
        System.out.println("Сегодня не учусь, мне лень.");
    }
}
