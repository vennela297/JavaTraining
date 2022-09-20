package ivycomptech.Day2.HomeAssessment;//5. Write a Java program to find whether a region in the current string matches a region in another string.
//        Sample Output:
//        str1[0 - 7] == str2[28 - 35]? true
//        str1[9 - 15] == str2[9 - 15]? false

import java.util.Scanner;

public class CompareSubstring {
    public static void main(String[] args) {
        System.out.println("Enter the strings to be compared\n");
        String str1="what are u doing";
        String str2="qwertyuioplkjhgfdsazxcvbnmaswhat are you doing";
        Scanner scan = new Scanner(System.in);
        //String str1=scan.nextLine();
        //String str2=scan.nextLine();
        String str3=str1.substring(0,8);
        String str4=str2.substring(28,36);
        System.out.println(str3.equals(str4));

    }

}

//testcase 1
//
//
