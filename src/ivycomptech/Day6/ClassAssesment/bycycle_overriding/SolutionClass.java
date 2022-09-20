package ivycomptech.Day6.ClassAssesment.bycycle_overriding;

public class SolutionClass {
    public static void main(String[] args) {
        Bycycle bycycle=new Bycycle();
        Bycycle bycycle1=new MountainBycycle();
        bycycle1.run();
    }
}
