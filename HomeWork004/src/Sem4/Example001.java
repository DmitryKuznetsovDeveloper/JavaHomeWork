package Sem4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example001<T> {

    //Поле
    private List<T> list;

    // конструктор
    public Example001(List<T> list){
        this.list = list;  // this -  ссылка на себя
    }

    // Свойства
    public List<T> getList() {
        return list;
    }
    public void setAddListElement(T element) {
        this.list.add(element);
    }
    public void reverseList(List<T> list){
        Collections.reverse(list);
    }

}
