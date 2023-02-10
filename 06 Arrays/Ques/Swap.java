package Ques;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 388, 49, 34};
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
