package Practical11;

import java.util.Random;

public class Practical11Q2quicksort{
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(20, 0, 100);

        System.out.println("Random array of integers (size 20):");
        printArray(randomArray);

        quickSort(randomArray, 0, randomArray.length - 1);

        System.out.println("\nSorted array in increasing order:");
        printArray(randomArray);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] randomArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(max - min + 1) + min;
        }

        return randomArray;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
