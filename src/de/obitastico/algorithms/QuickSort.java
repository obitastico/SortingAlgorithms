package de.obitastico.algorithms;

import static java.lang.Math.floorDiv;
import static java.lang.System.arraycopy;
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.concat;

public class QuickSort {
    private static int[] _quick_sort(int[] array){
        if (array.length <= 1){
            return array;
        }

        int pivot = array[floorDiv(array.length, 2)];

        int[] smaller = stream(array).filter(x -> x < pivot).toArray();
        int[] bigger = stream(array).filter(x -> x > pivot).toArray();

        return concat(concat(stream(_quick_sort(smaller)), stream(new int[]{pivot})),stream(_quick_sort(bigger))).toArray();
    }

    public static void quick_sort(int[] array){
        int[] sorted_list = _quick_sort(array);
        arraycopy(sorted_list, 0, array, 0, array.length);
    }
}
