package ivycomptech.Day7.ClassAssesment.OverridingImplementation;

import ivycomptech.Day7.ClassAssesment.OverridingImplementation.Animal;
import ivycomptech.Day7.ClassAssesment.OverridingImplementation.Carnivorus;
import ivycomptech.Day7.ClassAssesment.OverridingImplementation.Herbivorous;

public class SolutionClass {
    public static void main(String[] args) {
        Animal carnivorousAnimal=new Carnivorus();
        carnivorousAnimal.eat();

        Animal herbivorousAnimal=new Herbivorous();
        herbivorousAnimal.eat();



    }
}
