package designpattern.structural.decorator;

public class BlueCone implements IcecreamCone {
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getConstituents() {
        return "Blue Cone";
    }

}
