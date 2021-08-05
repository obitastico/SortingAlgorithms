package de.obitastico.algorithms;

import static java.lang.Math.floorDiv;

public class HeapSort {
    private static void heapify(int[] array, int n, int i){
        int largest = i;
        int left_child = 2 * i + 1;
        int right_child = 2 * i +2;

        if (left_child < n && array[largest] < array[left_child]){
            largest = left_child;
        }

        if (right_child < n && array[largest] < array[right_child]){
            largest = right_child;
        }

        if (largest != i) {
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;

            heapify(array, n, largest);
        }
    }

    public static void heap_sort(int[] array){
        int n = array.length;
        for (int i = floorDiv(n, 2); i > -1; i--){
            heapify(array, n, i);
        }

        for (int i = n - 1; i > -1; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapify(array, i, 0);
        }
    }
}
