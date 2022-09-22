package ivycomptech.Day8.HomeAssesment;

import java.util.Scanner;

public class CountAndSay {


    static String countAndSay(String s,int token,int num)
    {
        String str="";
        String nstr="";



            for (int i = 0; i < s.length(); i++) {


                int count = 1;
                while (i + 1 < s.length()
                        && s.charAt(i)
                        == s.charAt(i + 1)) {

                    i++;
                    count++;
                }


                str=String.valueOf(count)+s.charAt(i);


             nstr=nstr+str;
             token++;
            }





        if(token<num-1)
        {
            return countAndSay(nstr,token,num);
        }
        return nstr;
       }







    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int token=0;
        String str=countAndSay("1",token,num);
        System.out.println(str);





    }
}
