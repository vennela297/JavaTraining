package ivycomptech.Day8.ClassAssesment;

import java.util.Scanner;

//You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
//
//Example
//Candles = [4,4,1,3]
//The maximum height of candles is 4 units high. There are 2 of them, so return 2.
//
//Function Description
//Method birthdayCakeCandles() has the following parameter(s):
//•	int candles[n]: the candle heights
//Returns
//•	int: the number of candles that are tallest
//
//Input Format
//The first line contains a single integer, n, the size of candles[].
//The second line contains n space-separated integers, where each integer i describes the height of candles[i].
//
//Sample Input 0
//4
//3 2 1 3
//Sample Output 0
//2
//
//Explanation 0
//Candle heights are [3,2,1,3]. The tallest candles are 3 units, and there are 2 of them.
public class Candles {

    public int birthdayCakeCandles(int [] arr)
    {
        int max=arr[0];
        for(int i:arr)
        {
            if(max<i) {
                max = i;

            }

        }
        int count=0;
        for(int j:arr)
        {
            if(j==max)
            {
                count++;
            }
        }

     return count;

    }
    public static void main(String[] args) {
        Candles candle = new Candles();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of candles");
        int size=scan.nextInt();
        System.out.println("Enter the candle heights");
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        {
           arr[i]=scan.nextInt();
        }
        System.out.println(candle.birthdayCakeCandles(arr));


        //System.out.println("The maximum height of candles is "+max+ " units high"+" "+ "There are"+" "+ count);
    }
}
