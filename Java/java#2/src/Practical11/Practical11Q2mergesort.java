package Practical11;

import java.util.Random;

public class Practical11Q2mergesort{
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(20, 0, 100);

        System.out.println("Random array of integers (size 20):");
        printArray(randomArray);

        mergeSort(randomArray, 0, randomArray.length - 1);

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

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
