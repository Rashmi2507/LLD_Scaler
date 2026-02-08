package designpattern.behavioural.strategy.after2;

public class Main {
    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();

        pathCalculationStrategyRegistry.register(TransportMode.CAR, new CarPathCalculationStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.BIKE, new BikePathCalculationStrategy());
        pathCalculationStrategyRegistry.register(TransportMode.WALK, new WalkPathCalculationStrategy());

        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);
        googleMaps.findPath("A", "B", TransportMode.CAR);
        googleMaps.findPath("A", "B", TransportMode.BIKE);
        googleMaps.findPath("A", "B", TransportMode.WALK);

        System.out.println("Done");
    }
}
