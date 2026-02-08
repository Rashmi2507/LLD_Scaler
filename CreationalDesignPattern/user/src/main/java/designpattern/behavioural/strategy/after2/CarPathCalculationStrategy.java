package designpattern.behavioural.strategy.after2;

public class CarPathCalculationStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path by Car from " + from + " to " + to);
    }

}
