package ivycomptech.Day1;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Choose from the menu");
        System.out.println("Enter 1 from dosa ,2 for idly,3 for chapati , 4 for non-veg, 5 for icecream");

        Scanner scan=new Scanner(System.in);
        int menu=scan.nextInt();

        switch(menu)
        {
            case 1:
                System.out.println("Your have ordered for dosa , it will be ready in few minutes");
                break;
            case 2:
                System.out.println("Your have ordered for idly , it will be ready in few minutes");
                break;
            case 3:
                System.out.println("Your have ordered for chapati, it will be ready in few minutes");
                break;
            case 4:
                System.out.println("Your have ordered for non-veg , it will be ready in few minutes");
                break;
            case 5:
                System.out.println("Your have ordered for icecream , it will be ready in few minutes");
                break;



        }

    }
}
