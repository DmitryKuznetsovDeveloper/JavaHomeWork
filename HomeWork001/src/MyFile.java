import java.io.*;
import java.io.FileWriter;

public class MyFile {
    public static void WriteFile(String path) throws FileNotFoundException {
        File file = new File(path);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(UserInput.InputUserString("Введите Имя Фамилию Возраст"));
        printWriter.close();
        }

    }
