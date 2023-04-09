package mycode.massiveCort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

        System.out.println(Arrays.toString(array)); // [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]
    }
}
