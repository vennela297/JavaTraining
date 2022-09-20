package ivycomptech.Day4.ClassAssesment.Generics;

public class Printer<T extends Printer> {
    T whattodo;
    public Printer() {}
    Printer(T whattodo)
    {
       this.whattodo=whattodo;
    }

    public void releaseprint()
    {
        System.out.println("I am lazy");
    }
}
