import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {

//      1)  Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
        Integer[] arr = new Integer[]{2, 4, 9, 5, 4, 8, 1, 6};
        System.out.println("Начальный массив:" + "\t" + Arrays.toString(arr));
        MyMerge.mergeSort(arr);
        System.out.println("Сортировка слиянием:" + "\t" + Arrays.toString(arr));

//       2) Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,arr);
        MethodsLists.removeEvenNumbers(list);
        System.out.println("Лист без четных цифр:" + "\t" + list);

//      3)  Задан целочисленный список ArrayList. Найти минимальное, максимальное
//      и среднее из этого списка.
        System.out.println("Минимальное значение элемента:" + "\t" + Collections.min(list));
        System.out.println("Максимальное значение элемента:" + "\t" + Collections.max(list));
        System.out.println("Среднее арифметическое значение листа:" + "\t" + MethodsLists.middlArifmetic(list));
    }
}