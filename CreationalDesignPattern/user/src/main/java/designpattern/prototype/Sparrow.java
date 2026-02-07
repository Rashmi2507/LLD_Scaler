package designpattern.prototype;

public class Sparrow extends Bird {
    private String legSize = "10";

    public Sparrow() {
    }

    public Sparrow(Sparrow old) {
        super(old);
        this.legSize = old.legSize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }
}
