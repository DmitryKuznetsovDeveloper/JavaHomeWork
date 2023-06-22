package HomeWorkFive;
import java.util.Scanner;

public class InputUser {

        public static String InputUser(String message){
            System.out.print(message + " -> ");
            Scanner scannerNumber = new Scanner(System.in);
            return scannerNumber.nextLine();
        }
}
