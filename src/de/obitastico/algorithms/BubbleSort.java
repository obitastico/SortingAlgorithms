package de.obitastico.algorithms;

import java.util.LinkedList;
import java.util.List;

public class BubbleSort {
    public static void bubble_sort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
