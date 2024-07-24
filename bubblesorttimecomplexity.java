import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bubblesorttimecomplexity {
    // Bubble sort function
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to generate an array in ascending order (best case)
    public static int[] generateBestCase(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // Function to generate an array in descending order (worst case)
    public static int[] generateWorstCase(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    // Function to generate a random array (average case)
    public static int[] generateAverageCase(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    // Function to measure the time taken by bubble sort
    public static long measureTime(int[] arr) {
        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] bestCase = generateBestCase(size);
        int[] worstCase = generateWorstCase(size);
        int[] averageCase = generateAverageCase(size);

        long bestTime = measureTime(bestCase);
        long worstTime = measureTime(worstCase);
        long averageTime = measureTime(averageCase);

        System.out.println("Time taken for best case: " + bestTime + " milliseconds");
        System.out.println("Time taken for worst case: " + worstTime + " milliseconds");
        System.out.println("Time taken for average case: " + averageTime + " milliseconds");
    }
}



