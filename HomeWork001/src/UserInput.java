import java.util.Objects;
import java.util.Scanner;

public class UserInput {
    public static int InputUserInt(String message){
        Scanner scannerNumber = new Scanner(System.in);
        while (true){
        System.out.print(message + " -> ");
        if(scannerNumber.hasNextInt()) return scannerNumber.nextInt();
        else System.out.println("Извините, но это явно не число. Попробуйте снова!");
        }
    }
    public static String InputUserCalcSign(String message){
        Scanner scannerNumber = new Scanner(System.in);
        while (true){
            System.out.print(message + " -> ");
            String resut = scannerNumber.nextLine();
            if(Objects.equals(resut, "+") || Objects.equals(resut, "-") ||
                    Objects.equals(resut, "*") || Objects.equals(resut, "/")){
                return resut;
            }
            else System.out.println("Извините, но это явно не матиматический знак. Попробуйте снова!");
        }
    }
}
