public class MyMerge {
    public static void  mergeSort(int[] arr){
        int n = arr.length;
        if (n == 1) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < n - mid; i++) {
            right[i] = arr[i + mid];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftLenght = left.length, rightLenght = right.length;
        int i = 0, j = 0, indexResult = 0;

        while (i < leftLenght && j < rightLenght){
            if(left[i] < right[j]){
                arr[indexResult] = left[i];
                i++;
            }
            else {
                arr[indexResult] = right[j];
                j++;
            }
            indexResult++;
        }

        for (int k = i; k < leftLenght; k++) {
            arr[indexResult++]=left[k];
        }
        for (int k = j; k < rightLenght; k++) {
            arr[indexResult++]=right[k];
        }
    }
}