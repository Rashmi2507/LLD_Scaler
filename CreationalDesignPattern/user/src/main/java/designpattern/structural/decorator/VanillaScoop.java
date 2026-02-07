package designpattern.structural.decorator;

public class VanillaScoop implements IcecreamCone {

    private IcecreamCone icecreamCone;

    public VanillaScoop(IcecreamCone icecreamCone) {
        this.icecreamCone = icecreamCone;
    }

    @Override
    public int getCost() {
        return 10 + icecreamCone.getCost();
    }

    @Override
    public String getConstituents() {
        return "Vanilla Scoop " + icecreamCone.getConstituents();
    }

}
