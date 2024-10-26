package dz17;

import java.util.Arrays;

public class Sorted {
    public static void sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        sorted(new int[]{1, 5, 2, 0, -2, 2, 0, 21, 4});
    }
}
