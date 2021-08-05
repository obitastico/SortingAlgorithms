package de.obitastico.algorithms;

import java.util.LinkedList;

import static de.obitastico.Utils.toList;
import static java.lang.Math.floorDiv;
import static java.lang.Math.pow;
import static java.util.Arrays.stream;

public class RadixSort {
    public static void radix_sort(int[] array){
        LinkedList<Integer> sorted_list = new LinkedList<>(toList(array));
        int digit_index = 0;
        int max = stream(array).max().getAsInt();
        while (pow(10, digit_index) <= max){
            LinkedList<Integer>[] partions = new LinkedList[10];
            for (int i = 0; i < partions.length;i++){
                partions[i] = new LinkedList<>();
            }
            for (int value : sorted_list) {
                int index = floorDiv(value, (int) pow(10, digit_index)) % 10;
                partions[index].add(value);
            }

            sorted_list = new LinkedList<>();
            for (LinkedList<Integer> partion : partions){
                sorted_list.addAll(partion);
            }

            digit_index++;
        }

        for (int i = 0; i < array.length;i++){
            array[i] = sorted_list.get(i);
        }
    }
}
