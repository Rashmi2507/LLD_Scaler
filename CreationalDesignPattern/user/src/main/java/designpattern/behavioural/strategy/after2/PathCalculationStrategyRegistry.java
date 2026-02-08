package designpattern.behavioural.strategy.after2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {

    private Map<TransportMode, PathCalculatorStrategy> registry = new HashMap<>();

    public void register(TransportMode mode, PathCalculatorStrategy strategy) {
        registry.put(mode, strategy);
    }

    public PathCalculatorStrategy getStrategy(TransportMode mode) {
        return registry.get(mode);
    }
}
