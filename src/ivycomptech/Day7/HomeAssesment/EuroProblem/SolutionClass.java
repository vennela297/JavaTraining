package ivycomptech.Day7.HomeAssesment.EuroProblem;

public class SolutionClass {

    public static void main(String[] args) {
        Euro tenEuro=new Euro(10);
        Euro anothertenEuro=new Euro(10);
        Euro fiveEuro=new Euro(5);
        Euro twoEuro=new Euro(2);
        Euro anotherSevenEuro=new Euro(7);

        System.out.println(tenEuro.equals(anothertenEuro));
        Euro sevenEuro=fiveEuro.add(fiveEuro,twoEuro);
        System.out.println(sevenEuro.val);
        System.out.println(sevenEuro.equals(anotherSevenEuro));


    }

}
