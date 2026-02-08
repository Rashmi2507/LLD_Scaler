package designpattern.behavioural.strategy.after1;

public class BikePathCalculationStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path by Bike from " + from + " to " + to);
    }

}
