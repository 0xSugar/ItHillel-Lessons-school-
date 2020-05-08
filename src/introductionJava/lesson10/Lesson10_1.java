package introductionJava.lesson10;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Lesson10_1 {
    public static void main(String[] args) {
        int count = 5_000_000;
        int[] arraySelection = generateRandomArray(count);
        System.out.println(Arrays.toString(arraySelection));
        long startSelectionTime = System.currentTimeMillis();
        Arrays.sort(arraySelection);
        quickSort(arraySelection, 0, arraySelection.length-1);
        long endSelectionTime = System.currentTimeMillis();
        System.out.println("Selection sorting took " + (endSelectionTime - startSelectionTime));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }

    private static void sortSelectionArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tempValue = arr[i];
                arr[i] = minValue;
                arr[minIndex] = tempValue;
            }
        }
    }

    private static int[] generateRandomArray(int count) {
        SplittableRandom random = new SplittableRandom();
        int[] array = new int[count];
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = random.nextInt(0, 1000);
        }
        return array;
    }
}
