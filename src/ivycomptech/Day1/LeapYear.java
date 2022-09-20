package ivycomptech.Day1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter the date");
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        if(year%4==0||((year%100==0)&&(year%400==0)))
        {
            System.out.println("ITS A LEAP YEAR");
        }
        else
        {
            System.out.println("IT IS NOT A LEAP YEAR");
        }

    }
}
