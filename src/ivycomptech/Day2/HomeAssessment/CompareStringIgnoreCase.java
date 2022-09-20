package ivycomptech.Day2.HomeAssessment;
//4. Write a Java program to compare a given string to another string, ignoring case considerations.
//        Sample Output:
//        "Stephen Edwin King" equals "Walter Winchell"? false
//        "Stephen Edwin King" equals "stephen edwin king"? true

import java.util.Scanner;

public class CompareStringIgnoreCase {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the strings to compare");
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        System.out.println(str1.equalsIgnoreCase(str2));
    }

}
