package ivycomptech.Day1;

import java.util.Scanner;

public class MangoTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt(); int num = sc.nextInt();
        if (num < col || num % col == 0 || num % col == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }

}
