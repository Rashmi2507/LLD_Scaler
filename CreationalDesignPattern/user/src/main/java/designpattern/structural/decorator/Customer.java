package designpattern.structural.decorator;

public class Customer {
    public static void main(String[] args) {
        IcecreamCone chocobar = new ChocolateScoop(new ChocolateScoop(new BlueCone()));

        IcecreamCone icecreamCone = new VanillaScoop(
                new ButterscotchScoop(
                        new VanillaScoop(
                                new OrangeCone())));

        System.out.println("Constituents: " + icecreamCone.getConstituents());
        System.out.println("Cost: " + icecreamCone.getCost());

        IcecreamCone chocoVanillaBar = new VanillaScoop(chocobar);
        System.out.println("Constituents: " + chocoVanillaBar.getConstituents());
        System.out.println("Cost: " + chocoVanillaBar.getCost());

    }
}

// Pizza
// Coffee Machine
