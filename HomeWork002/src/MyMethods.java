import java.io.*;

public class MyMethods {

    public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
        }
        br.close();
        String [] listData = new String [size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;
    }

    // Вывод массива
    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) System.out.printf("%d, ", arr[i]);
    }
    public static void PrintArray(String [] arr) {
        for (String s : arr) System.out.println(s);
    }
}