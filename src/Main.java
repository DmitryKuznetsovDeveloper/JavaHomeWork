import HomeWorkFive.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//  1)Реализуйте структуру телефонной книги с помощью HashMap.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.CreateContact(3);
        phoneBook.phoneBookShow();

//  2)Реализовать алгоритм пирамидальной сортировки
//  (HeapSort)(найти метод в Интернете и включить в проект)
        int[] myArray = new int[20];
        MethodsArray.fillArray(myArray);
        MethodsArray.printArray(myArray);
        MyHeapSort.heapSort(myArray);
        MethodsArray.printArray(myArray);
    }

}