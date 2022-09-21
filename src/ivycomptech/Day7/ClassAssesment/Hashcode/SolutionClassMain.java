package ivycomptech.Day7.ClassAssesment.Hashcode;

public class SolutionClassMain {


    public static void main(String[] args) {
        Money money1=new Money(10);
        Money money2=new Money(10);
        System.out.println(money1.hashCode());
        System.out.println(money2.hashCode());

    }
}
