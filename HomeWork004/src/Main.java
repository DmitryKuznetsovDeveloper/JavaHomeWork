import Sem4.Example001;
import Sem4.Example002;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

        //Создаем экземпляр объекта, который обобщенный, то есть лист будет работать с тем типом
        // который мы зададим при создании экземпляра
        Example001<String> example001 = new Example001<>(new LinkedList<>());
        example001.setAddListElement("1");
        example001.setAddListElement("2");
        System.out.println("Задача 1:");
        System.out.println("Начальный лист = " + example001.getList());
        example001.reverseList(example001.getList());
        System.out.println("Перевернутый лист = " + example001.getList() + "\n");


        //    2. Реализуйте очередь с помощью LinkedList со следующими методами:
        //    enqueue() - помещает элемент в конец очереди,
        //    dequeue() - возвращает первый элемент из очереди и удаляет его,
        //    first() - возвращает первый элемент из очереди, не удаляя.
        Example002<Integer> example002 = new Example002<>(new LinkedList<>());
        example002.enqueue(1);
        example002.enqueue(2);
        example002.enqueue(3);
        System.out.println("Задача 2:");
        System.out.println("Заполненый лист " + example002.getList() + "\n");
        System.out.println("Возвращает первый элемент и удаляем его = " + example002.dequeue());
        System.out.println("Проверка, что элемент удален = " + example002.getList() + "\n");
        System.out.println("Возвращает первый элемент без удаления = " + example002.first());
        System.out.println("Проверка, что элемент все еще остался = " + example002.getList());
    }

}