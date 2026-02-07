package designpattern.structural.decorator;

public class ChocolateScoop implements IcecreamCone {

    private IcecreamCone icecreamCone;

    public ChocolateScoop(IcecreamCone icecreamCone) {
        this.icecreamCone = icecreamCone;
    }

    @Override
    public int getCost() {
        return 10 + icecreamCone.getCost();
    }

    @Override
    public String getConstituents() {
        return "Chocolate Scoop " + icecreamCone.getConstituents();
    }

}
