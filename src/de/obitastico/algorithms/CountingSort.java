package de.obitastico.algorithms;

import static de.obitastico.Utils.max;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.concat;

public class CountingSort {
    public static void counting_sort(int[] array){
        int[] value_counts = new int[max(array) + 1];
        for (int i : array) {
            int count = 0;
            for (int j : array) if (j == i) count++;
            value_counts[i] = count;
        }

        for (int i = 1; i < value_counts.length;i++){
            value_counts[i] += value_counts[i-1];
        }
        value_counts = concat(stream(new int[]{0}), stream(copyOf(value_counts, value_counts.length - 1))).toArray();

        int[] sorted_array = new int[array.length];

        for (int value : array){
            sorted_array[value_counts[value]] = value;
            value_counts[value]++;
        }

        System.arraycopy(sorted_array, 0, array, 0, array.length);
    }
}
