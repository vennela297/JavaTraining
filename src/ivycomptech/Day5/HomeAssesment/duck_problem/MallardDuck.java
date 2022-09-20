package ivycomptech.Day5.HomeAssesment.duck_problem;

public class MallardDuck implements Living, ProduceSound {
    @Override
    public void fly() {
        System.out.println("Mallard can fly");
    }

    @Override
    public void swim() {
        System.out.println("Mallard can swim");
    }

    @Override
    public void walk() {
        System.out.println("Mallard can walk");
    }

    @Override
    public void sound() {
        System.out.println("Mallard can make sound");
    }
}
