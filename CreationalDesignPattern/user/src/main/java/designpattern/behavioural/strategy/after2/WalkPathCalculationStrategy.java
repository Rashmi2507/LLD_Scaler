package designpattern.behavioural.strategy.after2;

public class WalkPathCalculationStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path by Walk from " + from + " to " + to);
    }

}
