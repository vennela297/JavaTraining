package ivycomptech.Day4.ClassAssesment.Generics;

public class SolutionClass {
    public static void main(String[] args) {

        NewsPaperPrinter newsPaperPrinter=new NewsPaperPrinter();
        Printer<NewsPaperPrinter> p=new Printer<NewsPaperPrinter>(newsPaperPrinter);
        p.releaseprint();

    }

}
