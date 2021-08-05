package de.obitastico.algorithms;

public class SelectionSort {
    public static void selection_sort(int[] array){
        for (int i = 0; i < array.length - 1;i++){
            int min_index = i;
            for (int j = i + 1; j < array.length;j++){
                min_index = array[min_index] > array[j] ? j : min_index;
            }

            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }
}
