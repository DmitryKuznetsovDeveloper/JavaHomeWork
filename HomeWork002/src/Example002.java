import java.io.IOException;
import java.util.logging.*;
    public class Example002 {
        public static void main(String[] args) throws IOException {
            Logger logger = Logger.getLogger(Example002.class.getName());
            FileHandler fh = new FileHandler("LogExample002.xml");
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.info("Sort Array");
            int [] array = {2, 5, 1, -7, 3, 64, 0};
            MyMethods.PrintArray(array);
            int[] newArr = listSort(array);
            System.out.print("\n Отсортированный массив: \n");
            MyMethods.PrintArray(newArr);
        }
        public static int[] listSort(int [] arr){
            for(int k = 0; k < arr.length-1; k++) {

                for (int i = 0; i < arr.length - k-1; i++){
                    if (arr[i] > arr[i+1]) {
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }
                }
            }
            return arr;
        }

    }

