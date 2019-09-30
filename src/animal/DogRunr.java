package animal;

import java.util.ArrayList;
import java.util.List;

public class DogRunr {
    public static void main(String[] args) {
       Animals Lord = new Puppy(0, "Lord", "Wite");
     //   Animals Boss = new Puppy(1, "Boss", "Blac");
        Animals Palkan = new Dog(5, "Palkan");

        List<Animals> animals = new ArrayList<>();
        //animals.add(Lord);
      //  animals.add(Boss);
        animals.add(Palkan);

        for (Animals animal : animals)
        {
            animal.voice();
            animal.run();
            animal.sting();
            animal.jump();

        }

    }
}
