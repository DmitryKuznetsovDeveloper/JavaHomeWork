package HomeWorkFive;

public class MyHeapSort {
        public static void heapSort(int[] array)
        {
            int length = array.length
                    ;
            for (int i = length / 2 - 1; i >= 0; i--)
                Heapify(array, length, i);

            for (int i = length-1; i>=0; i--)
            {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                Heapify(array, i, 0);
            }
        }
        private static void Heapify(int[] arr, int heapSize, int rootIndex)
        {
            int largest = rootIndex;
            int leftEl = 2*rootIndex + 1;
            int rightEl = 2*rootIndex + 2;

            // Если левый дочерний элемент больше корня
            if (leftEl < heapSize && arr[leftEl] > arr[largest])
                largest = leftEl;

            // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
            if (rightEl < heapSize && arr[rightEl] > arr[largest])
                largest = rightEl;

            // Если самый большой элемент не корень
            if (largest != rootIndex)
            {
                int temp = arr[rootIndex];
                arr[rootIndex] = arr[largest];
                arr[largest] = temp;
                Heapify(arr, heapSize, largest);
            }
        }
}
