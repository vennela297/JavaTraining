package ivycomptech.Day2.HomeAssessment;

import java.util.Random;
import java.util.Scanner;
public class RandomNumberGame {
    public static void main(String [] args)
    {

    System.out.println("Enter the number\n");

    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    boolean flag=true;
    Random random = new Random();
    int x = random.nextInt(5);

    do
    {


        if(num==x)
        {
            flag=false;
            System.out.println("you win");
        }
        else
        {
            if(num>x)
            {
                System.out.println("Too high, try a lower value");

                num=scan.nextInt();

            }
            else
            {
                if(num<x)
                {
                    System.out.println("Too low, try a higher value");
                    num=scan.nextInt();
                }

            }

        }




    }while(flag);
}

}
