package ivycomptech.Day7.HomeAssesment;

import java.util.Scanner;


public class MagicSquare {

    static boolean isMagicSquare(int arr[][])
    {
        int N=2;

        // calculate the sum of
        // the prime diagonal
        int DiagonalSum = 0;
        for (int i = 0; i < N; i++)
            DiagonalSum = DiagonalSum+ arr[i][i];

        // For sums of Rows
        for (int i = 0; i < N; i++) {

            int rowSum = 0;
            for (int j = 0; j < N; j++)
                rowSum += arr[i][j];

            // check if every row sum is
            // equal to prime diagonal sum
            if (rowSum != DiagonalSum)
                return false;
        }

        // For sums of Columns
        for (int i = 0; i < N; i++) {

            int colSum = 0;
            for (int j = 0; j < N; j++)
                colSum += arr[j][i];

            // check if every column sum is
            // equal to prime diagonal sum
            if (DiagonalSum != colSum)
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int arr[][] = {{ 4,5 },
                { 5,4 }};

        if (isMagicSquare(arr))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic" +
                    " Square");
    }



}
