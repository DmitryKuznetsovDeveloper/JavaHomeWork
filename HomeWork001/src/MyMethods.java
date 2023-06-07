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

    public static boolean Validate(int first, int second , int result){
        return first + second == result;
    }
    public static void SolutionExample(String expression){
        String[] numbers = expression.split("=");
        int resultExpression = Integer.parseInt(numbers[1].trim());
        String[] leftExpression = numbers[0].trim().replaceFirst(" ","").replace("+","").split(" ");
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            int first = Integer.parseInt(leftExpression[0].replace("?", String.valueOf(i)));
            for (int j = 0; j < 10; j++) {
                int second = Integer.parseInt(leftExpression[1].replace("?", String.valueOf(j)));
                if(Validate(first,second,resultExpression)){
                    System.out.println(first + " + " + second + " = " + resultExpression);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) System.out.println("Решения нет =(");
    }

    public static void ReverceArray(String message){
        String[] array = message.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void FindIindex(int[] array){
        int resultIndex = -1;
        for (int i = 0; i <array.length; i++) {
            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < array.length; j++) {
                if (j < i) sumLeft += array[j];
                if (j > i) sumRight += array[j];
                if (sumLeft == sumRight) resultIndex = i;
            }
            sumLeft = 0;
            sumRight = 0;
        }
        System.out.println("Индекс = " + resultIndex);
    }
}
