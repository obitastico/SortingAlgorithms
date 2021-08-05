package de.obitastico.algorithms;

import java.util.LinkedList;
import java.util.ListIterator;

import static de.obitastico.Utils.toList;
import static java.lang.Math.floorDiv;
import static java.util.Arrays.copyOfRange;

public class MergeSort {
    private static LinkedList<Integer> _merge_sort(LinkedList<Integer> list){
        if (list.size() <= 1){
            return list;
        }

        LinkedList<Integer> part_one = _merge_sort(new LinkedList<>(list.subList(0, floorDiv(list.size(), 2))));
        LinkedList<Integer> part_two = _merge_sort(new LinkedList<>(list.subList(floorDiv(list.size(), 2), list.size())));

        LinkedList<Integer> merged_list = new LinkedList<>();
        while (!part_one.isEmpty() && !part_two.isEmpty()){
            merged_list.add((part_one.get(0) > part_two.get(0) ? part_two : part_one).removeFirst());
        }

        merged_list.addAll(part_one);
        merged_list.addAll(part_two);
        return merged_list;
    }

    public static void merge_sort(int[] array){
        LinkedList<Integer> sorted_list = _merge_sort(toList(array));

        for (int i = 0; i < array.length;i++){
            array[i] = sorted_list.get(i);
        }
    }
}
