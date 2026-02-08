package designpattern.behavioural.strategy.after1;

public class GoogleMaps {
    private PathCalculationStrategyFactory factory = new PathCalculationStrategyFactory();

    public void findPath(String from, String to, TransportMode mode) {
        PathCalculatorStrategy strategy = factory.getPathCalculationStrategy(mode);
        strategy.calculatePath(from, to);
    }
}
