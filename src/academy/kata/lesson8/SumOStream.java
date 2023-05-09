package academy.kata.lesson8;

import java.io.IOException;
import java.io.InputStream;

/*
4.2.5 Практическое задание Метод intsumOfStream(InputStream inputStream)

Напишите метод int sumOfStream(InputStream inputStream), который принимает InputStream и возвращает
сумму всех его элементов.
Пример ввода: 1, 2, 4, 10
Пример вывода: 17
Требования:
1. Метод должен быть публичным.
2. Параметр должен иметь тип InputStream.
3. Сигнатура метода должна быть: sumOfStream(InputStream inputStream)


public int sumOfStream(InputStream inputStream) throws IOException {
   //твой код здесь
}

 */
public class SumOStream {

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int nextByte = inputStream.read();
        while (nextByte != -1) {
            sum += nextByte;
        }
        return sum;
    }
}
