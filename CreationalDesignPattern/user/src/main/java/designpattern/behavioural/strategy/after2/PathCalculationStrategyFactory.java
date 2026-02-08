package designpattern.behavioural.strategy.after2;

public class PathCalculationStrategyFactory {
    PathCalculatorStrategy getPathCalculationStrategy(TransportMode mode) {
        if (mode == TransportMode.CAR) {
            return new CarPathCalculationStrategy();
        } else if (mode == TransportMode.BIKE) {
            return new BikePathCalculationStrategy();
        } else if (mode == TransportMode.WALK) {
            return new WalkPathCalculationStrategy();
        }
        return null;
    }
}
