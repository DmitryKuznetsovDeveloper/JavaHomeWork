import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //1) Вычислить сумма чисел от 1 до n
        int userNumber = UserInput.InputUserInt("Введите число до которого будем считать сумму чисел");
        System.out.println("Сумма чисел от 1 до " + userNumber + " = " + MyMethods.SumNumber(userNumber));

        //2) Вывести все простые числа от 1 до 1000
        int userPrimeNumber = UserInput.InputUserInt("Введите число до которого будем искать простые числа");
        MyMethods.PrimeNumbers(userPrimeNumber);
        System.out.println();

        //3) Реализовать простой калькулятор
        MyCalculator.Start();

        //4) (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0.
        //Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
        //Требуется восстановить выражение до верного равенства.
        //Предложить хотя бы одно решение или сообщить, что его нет.
        MyMethods.SolutionExample("?7 + 5? = 69");

        // 5) Во фразе "Добро пожаловать на курс по Java" переставить слова
        //в обратном порядке.
        String message = "Добро пожаловать на курс по Java";
        MyMethods.ReverceArray(message);

        //8)Написать программу, которая найдет индекс i для этого массива
        //такой, что сумма элементов с индексами < i равна сумме
        //элементов с индексами > i.
        int[] array = new int[] {1,7,3,6,5,6};
        MyMethods.FindIindex(array);

        //9)Записать в файл следующие данные:
        //Name Surname Age
        //Kate Smith 20
        //Paul Green 25
        //Mike Black 23
        String path = "myFile.txt";
        MyFile.WriteFile(path);
    }

}