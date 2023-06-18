package Sem4;

import java.util.List;

public class Example002<T> {
//    2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
//    dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
    private List<T> list;

    //Свойство
    public List<T> getList() {
        return list;
    }
    // конструктор
    public Example002(List<T> list){
        this.list = list;  // this -  ссылка на себя
    }
    public void enqueue(T param){
        this.list.add(param);
    }
    public T dequeue(){
        T temp = this.list.get(0);
        this.list.remove(0);
        return temp;
    }
    public T first(){
       return this.list.get(0);
    }
}
