package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.setName("Parrot");
        bird1.setColor("Green");
        bird1.setWeight(2);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("Brown");
        sparrow1.setLegSize("10");

        Crow crow1 = new Crow();
        crow1.setSound("cow-cow");
        crow1.setWeight(3);

        List<Bird> birds = List.of(
                crow1,
                sparrow1,
                bird1);

        List<Bird> children = new ArrayList<>();

        for (Bird parent : birds) {
            children.add(parent.clone());
        }

        Sparrow longLegSparrow = new Sparrow();
        longLegSparrow.setLegSize("20");

        Crow sweetCrow = new Crow();
        sweetCrow.setSound("sweet-crow");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("longLegSparrow", longLegSparrow);
        birdRegistry.registerBird("sweetCrow", sweetCrow);

        List<String> getBirdOfTypes = List.of(
                "longLegSparrow",
                "sweetCrow",
                "longLegSparrow");

        List<Bird> requestedBirds = new ArrayList<>();
        for (String birdType : getBirdOfTypes) {
            requestedBirds.add(birdRegistry.getBird(birdType));
        }

        System.out.println("done");
    }
}
