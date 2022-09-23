package ivycomptech.Day9_Assesment;

import java.util.Scanner;

public class HandleMethod {
    public String name;
    public int index;
    public int space=0;


    public HandleMethod(String name) {
        this.name=name;
    }

    public int countOfWhiteSpace(String name)
    {
        for(int i=0; i<name.length(); i++){
            char ch=name.charAt(i);
            if(ch==' '){
                space++;
            }
        }
        return space;

    }

    public boolean hasWhiteSpace(String name)
    {




        if(countOfWhiteSpace(name)==1)
        {
            char [] charecterArray=name.toCharArray();
            for(int i=0;i< charecterArray.length;i++)
            {
                if(charecterArray[i]==' ')
                {
                    this.index=i;
                    return true;

                }

            }


        }

        return false;
    }

    private static boolean isAllUpper(String s) {
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c) && Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    public String greet(String name)

    {

        if(countOfWhiteSpace(name)>1)
        {
            String [] strArray=null;
            strArray=name.split(" ");
            String finalString="";
             int lastindex =name.lastIndexOf(" ");
            for(String str: strArray)
            {
                if(isAllUpper(name))
                {
                    return (finalString+ " "+"HELLO "+str);
                }
                finalString=finalString+str+", ";

            }
            return ("Hello "+finalString);
        }
        String str1="";
        if(hasWhiteSpace(name))
        {
            str1=name.substring(0,index);

            return ("Hello"+" "+ str1+" and "+name.substring(index,name.length()));
        }
        if(isAllUpper(name))
        {
            return ("HELLO"+" "+name);
        }
        if(name.length()>=1)
        {
            return ("Hello"+" "+name);
        }

        return ("Hello"+" "+"my friend");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name=scan.nextLine();

        HandleMethod handler1=new HandleMethod(name);

        System.out.println(handler1.greet(name));


    }
}
