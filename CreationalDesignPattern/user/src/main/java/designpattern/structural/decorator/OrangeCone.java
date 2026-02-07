package designpattern.structural.decorator;

public class OrangeCone implements IcecreamCone {
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getConstituents() {
        return "Orange Cone";
    }

}
