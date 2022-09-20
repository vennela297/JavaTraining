package ivycomptech.Day2.HomeAssessment;

import java.util.Scanner;
public class RaiseToPower {
    public static void main(String[] args) {
        System.out.println("Enter the numbers\n");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int res=1;
        for(int i=0;i<num2;i++)
        {
            res=res*num1;
        }
        System.out.println(res);


    }
}
