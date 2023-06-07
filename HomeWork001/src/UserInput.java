import java.util.Objects;
import java.util.Scanner;

public class UserInput {
    public static int InputUserInt(String message){
        while (true) {
            System.out.print(message + " -> ");
            Scanner scannerNumber = new Scanner(System.in);
            if (scannerNumber.hasNextInt()) {
                return scannerNumber.nextInt();
            } else {
                System.out.println("Извините, но это явно не число. Попробуйте снова!");
            }
        }
    }
    public static String InputUserCalcSign(String message){
        while (true){
            System.out.print(message + " -> ");
            Scanner scannerNumber = new Scanner(System.in);
            String result = scannerNumber.nextLine();
            if(Objects.equals(result, "+") || Objects.equals(result, "-") ||
                    Objects.equals(result, "*") || Objects.equals(result, "/")){
                return result;
            }
            else System.out.println("Извините, но это явно не матиматический знак. Попробуйте снова!");
        }
    }
}
