package de.obitastico;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Utils {

    public static int[] range(int start, int end){
        assert start < end : "end muss größer als start sein";
        int[] array = new int[end - start];
        for (int i = start; i < end; i++){
            array[i] = i;
        }
        return array;
    }

    public static void shuffle(int[] array){
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static LinkedList<Integer> toList(int[] arr){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i : arr)
            list.add(i);
        return list;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int max(int[] array) {
        int max_value = array[0];
        for (int value: array) {
            max_value = Math.max(value, max_value);
        }
        return max_value;
    }
}
