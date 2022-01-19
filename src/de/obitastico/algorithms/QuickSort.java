package de.obitastico.algorithms;

import static de.obitastico.Utils.swap;
import static java.lang.Math.floorDiv;
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

    public static void quick_sort(int[] array, int lowIndex, int highIndex){
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = floorDiv(lowIndex + highIndex, 2);
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        if (array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }

        quick_sort(array, lowIndex, leftPointer - 1);
        quick_sort(array, leftPointer + 1, highIndex);
    }
}
