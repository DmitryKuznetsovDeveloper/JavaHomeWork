package MyPackage;
import java.util.Objects;
//Базовое задание:
//Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники -
//выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Переопределить toString, equals и hashCode(как на семинаре).
//Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.
public class Laptops {
    // Поля
    private String model;
    private String operatingSystem;
    private String processor;
    private String videoCard;
    private String hdd;
    private String ram;
    private String weight;

    // Свойства для чтения
    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getWeight() {
        return weight;
    }

    // Все вариации конструкторов, с перевызовом конструкторов
    public Laptops() {
        model = "Неизвестно";
        operatingSystem = "Неизвестно";
        processor = "Неизвестно";
        videoCard = "Неизвестно";
        hdd = "Неизвестно";
        ram = "Неизвестно";
        weight = "Неизвестно";
    }

    public Laptops(String model) {
        this();
        this.model = model;
    }

    public Laptops(String model, String operatingSystem) {
        this(model);
        this.operatingSystem = operatingSystem;
    }

    public Laptops(String model, String operatingSystem, String processor) {
        this(model, operatingSystem);
        this.processor = processor;
    }

    public Laptops(String model, String operatingSystem, String processor, String videoCard) {
        this(model, operatingSystem,processor);
        this.videoCard = videoCard;
    }

    public Laptops(String model, String operatingSystem, String processor, String videoCard, String hdd) {
        this(model, operatingSystem,processor,videoCard);
        this.hdd = hdd;
    }

    public Laptops(String model, String operatingSystem, String processor, String videoCard, String hdd,
                   String ram) {
        this(model, operatingSystem,processor,videoCard,hdd);
        this.ram = ram;
    }

    public Laptops(String model, String operatingSystem, String processor, String videoCard, String hdd,
                   String ram, String weight) {
        this(model, operatingSystem,processor,videoCard,hdd,ram);
        this.weight = weight;
    }

    // Переопределения методов toString, equals и hashCode

    @Override
    public String toString(){
        return  "\nМодель : "+model+"\n"+
                "Операционная система : "+operatingSystem+"\n"+
                "Процессор : "+processor+"\n"+
                "Видео карта : "+videoCard+"\n"+
                "Жесткий диск : "+hdd+"\n"+
                "ОЗУ : "+ram+"\n"+
                "Вес : "+weight+"\n";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Laptops laptops = (Laptops) obj;
        return model == laptops.model && operatingSystem == laptops.operatingSystem &&
                processor == laptops.processor && videoCard == laptops.videoCard &&
                hdd == laptops.hdd && ram == laptops.ram && weight == laptops.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, operatingSystem, processor, videoCard, hdd, ram, weight);
    }
}