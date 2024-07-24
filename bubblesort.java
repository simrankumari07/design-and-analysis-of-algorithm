public class bubblesort {

    public static void main(String[] args) {
       
        int[] worstCaseArray = generateDescendingArray(1000);
        System.out.println("Bubble Sort - Worst Case:");
        System.out.println("Before sorting:");
        printArray(worstCaseArray);
        bubbleSort(worstCaseArray);
        System.out.println("After sorting:");
        printArray(worstCaseArray);

        
        int[] bestCaseArray = generateAscendingArray(1000);
        System.out.println("\nBubble Sort - Best Case:");
        System.out.println("Before sorting:");
        printArray(bestCaseArray);
        bubbleSort(bestCaseArray);
        System.out.println("After sorting:");
        printArray(bestCaseArray);

        
        int[] averageCaseArray = generateRandomArray(1000);
        System.out.println("\nBubble Sort - Average Case:");
        System.out.println("Before sorting:");
        printArray(averageCaseArray);
        bubbleSort(averageCaseArray);
        System.out.println("After sorting:");
        printArray(averageCaseArray);
    }

    
    public static int[] generateDescendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i; 
        }
        return array;
    }

   
    public static int[] generateAscendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1; 
        }
        return array;
    }

   
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1; 
        }
       
        for (int i = size - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                   
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
           
            if (!swapped) {
                break;
            }
        }
    }

    
    public static void printArray(int[] array) {
        
        for (int i = 0; i < Math.min(20, array.length); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

