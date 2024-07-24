
import java.util.Random;

public class HeapSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(1000);

        System.out.println("Heap Sort:");
        System.out.println("Before sorting:");
        printArray(array);

        heapSort(array);

        System.out.println("\nAfter sorting:");
        printArray(array);
    }

    
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); 
        }
        return array;
    }

    
    public static void heapSort(int[] array) {
        int n = array.length;

       
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

       
        for (int i = n - 1; i > 0; i--) {
            
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            
            heapify(array, i, 0);
        }
    }

    
    public static void heapify(int[] array, int n, int i) {
        int largest = i; 
        int leftChild = 2 * i + 1; 
        int rightChild = 2 * i + 2; 

        
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

       
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

       
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            
            heapify(array, n, largest);
        }
    }

    
    public static void printArray(int[] array) {
        for (int i = 0; i < Math.min(20, array.length); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
