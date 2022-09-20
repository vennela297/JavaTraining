package ivycomptech.Day2.ClassAssesment;

import java.util.Scanner;

public class FindCharAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string\n");
        String str=scanner.nextLine();
        System.out.println("Enter the index");
        int index= scanner.nextInt();
        System.out.println(str.charAt(index));
    }
}
