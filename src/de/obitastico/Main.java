package de.obitastico;

import java.util.Arrays;

import static de.obitastico.Utils.range;
import static de.obitastico.Utils.shuffle;
import static de.obitastico.algorithms.QuickSort.quick_sort;


public class Main {
    public static void main(String[] args) {
        int data_length = 50;
        int[] numbers = range(0, data_length);
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        // bubble_sort(values);
        // selection_sort(values);
        // insertion_sort(values);
        // heap_sort(values);
        // merge_sort(values);
        quick_sort(numbers, 0, numbers.length - 1);
        // radix_sort(values);
        // counting_sort(values);
        System.out.println(Arrays.toString(numbers));
    }
}