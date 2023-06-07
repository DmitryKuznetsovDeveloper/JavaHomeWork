public class MyMethods {
    public static int SumNumber(int number){
        int result = 0;
        for (int i = 1; i <= number; i++) result += i;
        return result;
    }
    public static void PrimeNumbers(int number){
        int div = 0,countNumber = 0, countLine = 10;
        for (int i = 2; i <= number ; i++) {
            for (int j = 1; j <= i ; j++) {
                if(i % j == 0) div++;
            }
            if(div == 2) {
                System.out.print(i+"\t\t");
                countNumber++;
            }
            div = 0;
            if (countLine == countNumber){
                System.out.print("\n");
                countLine += 10;
            }
        }
    }
}
