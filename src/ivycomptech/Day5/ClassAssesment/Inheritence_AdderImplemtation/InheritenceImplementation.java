package ivycomptech.Day5.ClassAssesment.Inheritence_AdderImplemtation;//Write the following code in your editor below:
//        1.	A class named Arithmetic with a method named add that takes  2 integers as parameters and returns an integer denoting their sum.
//        2.	A class named Adder inherits from a superclass named Arithmetic.
//        Your classes should not be public.
//        Input Format
//        You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it 2 integer parameters.
//        Output Format
//        You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.
//        Sample Output
//        The main method in the Solution class above should print the following:
//        My superclass is: Arithmetic
//        42 13 20


public class InheritenceImplementation {
    public static void main(String[] args) {
        Adder addObj=new Adder();
        System.out.println("My super class is"+" "+addObj.getClass().getSuperclass());
        System.out.println(addObj.add(10,20));
    }
}
