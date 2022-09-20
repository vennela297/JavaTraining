package ivycomptech.Day3.ClassAssesment;

import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=scan.nextInt();


        int num2 = scan.nextInt();
        try
        {

            if(num2==0)
            {
                throw new NullPointerException("enter a number greater than 0");
            }

        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }


        System.out.println("Enter your choice ,1:addition ,2:substraction, 3.multiplication,  4:division");
        int choice=scan.nextInt();
        int sum=0;
        int ans=1;
        int mul=1;
        int sub=0;

        switch (choice)
        {
            case 1:
                sum=num1+num2;
                System.out.println(sum);
                break;


            case 4:
                try
                {
                    if(num2==0)
                    {
                        throw new ArithmeticException("Enter a number greater than 0");
                    }

                }
                catch(ArithmeticException e)
                {
                    System.out.println(e);
                    ans=num1/num2;
                    System.out.println(ans);
                }
                break;
            case 3:
                mul=num1*num2;
                System.out.println(mul);
                break;

            case 2:
                sub=num1-num2;
                System.out.println(sub);
                break;



        }

    }
}
