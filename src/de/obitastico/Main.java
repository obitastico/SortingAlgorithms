package de.obitastico;

import java.util.Arrays;

import static de.obitastico.Utils.range;
import static de.obitastico.Utils.shuffle;

import static de.obitastico.algorithms.SelectionSort.selection_sort;
import static de.obitastico.algorithms.InsertionSort.insertion_sort;
import static de.obitastico.algorithms.CountingSort.counting_sort;
import static de.obitastico.algorithms.BubbleSort.bubble_sort;
import static de.obitastico.algorithms.MergeSort.merge_sort;
import static de.obitastico.algorithms.QuickSort.quick_sort;
import static de.obitastico.algorithms.RadixSort.radix_sort;
import static de.obitastico.algorithms.HeapSort.heap_sort;


public class Main {
    public static void main(String[] args) {
        int data_length = 500000;
        int[] values = range(0, data_length);
        shuffle(values);
        System.out.println(Arrays.toString(values));
        // bubble_sort(values);
        // selection_sort(values);
        // insertion_sort(values);
        // heap_sort(values);
        // merge_sort(values);
        // quick_sort(values);
        // radix_sort(values);
        // counting_sort(values);
        System.out.println(Arrays.toString(values));
    }
}