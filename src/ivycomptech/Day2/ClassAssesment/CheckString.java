package ivycomptech.Day2.ClassAssesment;

import java.util.Scanner;

public class CheckString {




        public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the strings to compare");
            String str1=scan.nextLine();
            String str2=scan.nextLine();
            System.out.println(str1.equals(str2));
        }

    }

