import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Example004 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Example002.class.getName());
        FileHandler fh = new FileHandler("LogСalculator.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Работа с калькулятора");
        Start();
    }
    public static void Start(){
        boolean flag = true;
        while (flag){
            int firstNumber = UserInput.InputUserInt("Введите первое число");
            String sign = UserInput.InputUserCalcSign("Введите матиматический знак '+','-','*','/'");
            int secondNumber = UserInput.InputUserInt("Введите второе число");
            switch (sign) {
                case "+" -> System.out.println("Сумма чисел " + firstNumber + " + " + secondNumber +
                        " = " + (firstNumber + secondNumber));
                case "-" -> System.out.println("Разность чисел " + firstNumber + " - " + secondNumber +
                        " = " + (firstNumber - secondNumber));
                case "*" -> System.out.println("Умножение чисел " + firstNumber + " * " + secondNumber +
                        " = " + (firstNumber * secondNumber));
                case "/" -> System.out.println("Деление чисел " + firstNumber + " / " + secondNumber +
                        " = " + (firstNumber / secondNumber));
            }
            int validateNumber = UserInput.InputUserInt("Введите число: 1 - если хотите выйти\n" +
                    "Введите число: 0 - если хотите продолжить");
            if (validateNumber == 1) flag = false;
        }
    }
}
