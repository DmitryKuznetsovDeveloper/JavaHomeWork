import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//      1)  Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
        int[] arr = new int[]{2, 9, 5, 4, 8, 1, 6};
        System.out.println(Arrays.toString(arr));
        MyMerge.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
//        Пусть дан произвольный список целых чисел, удалить из него четные числа
//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    }
}