package ivycomptech.Day8.ClassAssesment;

import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {

    public boolean isStringBalanced(String str)
    {
        Stack<Character> myStack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            switch (ch)
            {
                case '[':
                case '{':
                case '(':
                {
                    myStack.push(ch);

                }
                break;

                case '}':
                {
                    if(myStack.peek()!='{')
                    {
                       return false;

                    }
                }
                break;
                case ')':
                {
                    if(myStack.peek()!='(')
                    {
                        return false;

                    }
                }
                break;
                case ']':
                {
                    if(myStack.peek()!='[')
                    {
                        return false;

                    }
                }
                break;

            }
        }
     return true;
    }
    public static void main(String[] args) {
        balancedParenthesis obj=new balancedParenthesis();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.println(obj.isStringBalanced(str));


    }
}
