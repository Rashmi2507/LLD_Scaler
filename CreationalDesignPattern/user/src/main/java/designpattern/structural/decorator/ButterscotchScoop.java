package designpattern.structural.decorator;

public class ButterscotchScoop implements IcecreamCone {

    private IcecreamCone icecreamCone;

    public ButterscotchScoop(IcecreamCone icecreamCone) {
        this.icecreamCone = icecreamCone;
    }

    @Override
    public int getCost() {
        return 15 + icecreamCone.getCost();
    }

    @Override
    public String getConstituents() {
        return "Butterscotch Scoop " + icecreamCone.getConstituents();
    }

}
