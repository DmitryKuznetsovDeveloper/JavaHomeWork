package HomeWorkFive;

import java.util.Arrays;
import java.util.Random;

public class MethodsArray {
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
   public static void fillArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(1,100);
    }
}
