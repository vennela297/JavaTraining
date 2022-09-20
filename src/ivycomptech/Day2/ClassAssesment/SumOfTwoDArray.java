package ivycomptech.Day2.ClassAssesment;

import java.util.Arrays;

public class SumOfTwoDArray {

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3}, {1, 2, 3}, {1, 2, 3}
        };
        int[][] arr2 = {
                {1, 2, 3}, {1, 2, 3}, {1, 2, 3}
        };
        int[][] result = new int[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println(Arrays.toString(result[i]));
        }

    }
}
