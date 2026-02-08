package designpattern.behavioural.strategy.before;

public class GoogleMaps {
    public void findPath(String from, String to, TransportMode mode) {
        if (mode == TransportMode.CAR) {
            System.out.println("Finding path by Car from " + from + " to " + to);
        } else if (mode == TransportMode.BIKE) {
            System.out.println("Finding path by Bike from " + from + " to " + to);
        } else if (mode == TransportMode.WALK) {
            System.out.println("Finding path by Walk from " + from + " to " + to);
        }
    }
}
