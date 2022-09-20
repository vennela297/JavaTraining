package ivycomptech.Day5.HomeAssesment.duck_problem;

public class RubberDuck implements Squesable, ProduceSound {
    @Override
    public void sound() {
        System.out.println("Rubber Duck produces Sound");
    }

    @Override
    public void squeese() {
        System.out.println("Rubber Duck can be squessed");
    }
}
