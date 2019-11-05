package lesson6;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    }

    public int[] arrFour(int[] arr) {
        int sum = 0;
        int[] arr2 = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                sum++;
                arr2 = Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
            try {
                if (sum == 0) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException re) {
                return arr2;
            }


        return arr2;
    }
}
