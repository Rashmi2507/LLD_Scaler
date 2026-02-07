package designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    private Map<String, Bird> birdMap = new HashMap<>();

    public void registerBird(String name, Bird bird) {
        birdMap.put(name, bird);
    }

    public Bird getBird(String name) {
        return birdMap.get(name).clone();
    }
}
