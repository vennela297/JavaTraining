package ivycomptech.Day6.ClassAssesment.Multilevel_inheritence;

public class SolutionClass {
    public static void main(String[] args) {
        GrandFather father=new Father();
        father.swimming();


        GrandFather son=new Son();
        son.swimming();

    }
}
