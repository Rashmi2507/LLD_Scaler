package designpattern.behavioural.strategy.after2;

public class GoogleMaps {
    private PathCalculationStrategyRegistry pathCalculationStrategyRegistry;

    public GoogleMaps(PathCalculationStrategyRegistry pathCalculationStrategyRegistry) {
        this.pathCalculationStrategyRegistry = pathCalculationStrategyRegistry;
    }

    public void findPath(String from, String to, TransportMode mode) {
        PathCalculatorStrategy strategy = pathCalculationStrategyRegistry.getStrategy(mode);
        strategy.calculatePath(from, to);
    }
}
