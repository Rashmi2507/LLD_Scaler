package designpattern.prototype;

public class Crow extends Bird {

    private String sound = "Kaw";

    public Crow() {
    }

    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }

    @Override
    public Crow clone() {
        return new Crow(this);
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
