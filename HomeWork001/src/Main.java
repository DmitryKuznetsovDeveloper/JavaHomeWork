import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
        MyMethods.SolutionExample("2? + ?5 = 69");
    }
}