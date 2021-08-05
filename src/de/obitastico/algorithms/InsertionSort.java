package de.obitastico.algorithms;

public class InsertionSort {
    public static void insertion_sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            int value = array[i];
            while (j >= 0 && array[j] > value){
                array[j+1] = array[j];
                j -= 1;
            }

            array[j+1] = value;
        }
    }
}
