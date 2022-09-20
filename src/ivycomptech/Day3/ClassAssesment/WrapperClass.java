package ivycomptech.Day3.ClassAssesment;//Convert Primitive Type to Wrapper Objects (boxing/autoboxing)
//For the following:
//int a = 9;
//double d = 6.78;
//and check if they are converted to wrapper classes
//Sample output:
//An object of Integer is created.
//An object of Double is created.

public class WrapperClass {
    public static void main(String [] args)
    {
        int a=9;
        Integer val=a;
        double d = 6.78;
        Double val1=d;
        if(val.getClass().isPrimitive())
        {
            System.out.println("it is a primitive value");
        }
        else {
            System.out.println("An object of Integer is created");
        }


        if(val1.getClass().isPrimitive())
        {
            System.out.println("it is a primitive value");
        }
        else {
            System.out.println("An object of Double is created");

        }



    }

}
