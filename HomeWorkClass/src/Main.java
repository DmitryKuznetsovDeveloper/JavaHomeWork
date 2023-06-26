import MyPackage.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Создаем экземпляры класса ноутбуков и заполняем через конструктор
        Laptops laptops1 = new Laptops();
        Laptops laptops2 = new Laptops("Lenovo");
        Laptops laptops3 = new Laptops("Asus","Windows","AMD Ryzen",
                "AMD Radeon Vega 7","SSD 512","36 GB", "1.7 кг");
        Laptops laptops4 = new Laptops("Asus","Windows","AMD Ryzen",
                "AMD Radeon Vega 7","SSD 512","36 GB", "1.7 кг");
        Laptops laptops5 = new Laptops("Asus","Windows","AMD Ryzen",
                "AMD Radeon Vega 7");

        // Создам HashSet ноутбуков и добавляем элементы
        HashSet<Laptops> setLaptops = new HashSet<>();
        setLaptops.add(laptops1);
        setLaptops.add(laptops2);
        setLaptops.add(laptops3);
        setLaptops.add(laptops4);
        setLaptops.add(laptops5);


        // Выводим HashSet ноутбуков
        System.out.println(setLaptops.toString());

        //Сравниваем экземпляры объектов на рвенство через метод equals
        System.out.println("\nСравниваем экземпляры объектов на равенство через метод equals -");
        System.out.println(laptops1.equals(laptops3));
        System.out.println(laptops3.equals(laptops4));

        //Сравниваем экземпляры объектов на рвенство хэшей через метод hashCode
        System.out.println("\nСравниваем экземпляры объектов на равенство хэшей через метод hashCode -");
        System.out.println(laptops4.hashCode());
        System.out.println(laptops3.hashCode());

    //Ищем экземпляр объекта в HashSet
        System.out.println("\nИщем экземпляр объекта в HashSet - " + setLaptops.contains(laptops3));
    }
}
