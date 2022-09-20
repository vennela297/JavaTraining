package ivycomptech.Day2.HomeAssessment;//while --> Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int number=scan.nextInt();

        //int number = 987654,
        int reverse = 0;
        while(number != 0)
           {
               int remainder = number % 10;
               reverse = reverse * 10 + remainder;
               number = number/10;

           }
                System.out.println("The reverse of the given number is: " + reverse);
            }
        }


