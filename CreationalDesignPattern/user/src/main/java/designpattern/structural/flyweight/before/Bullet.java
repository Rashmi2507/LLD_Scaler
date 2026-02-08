package designpattern.structural.flyweight.before;

public class Bullet {
    private double radius;
    private double xcoord;
    private double ycoord;
    private double zcoord;
    private double weight;
    private BulletType bulletType;
    private double speed;
    private BulletStatus bulletStatus;
    private byte[] image;
    private long userId;
    private double x_dir;
    private double y_dir;
    private double z_dir;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getXcoord() {
        return xcoord;
    }

    public void setXcoord(double xcoord) {
        this.xcoord = xcoord;
    }

    public double getYcoord() {
        return ycoord;
    }

    public void setYcoord(double ycoord) {
        this.ycoord = ycoord;
    }

    public double getZcoord() {
        return zcoord;
    }

    public void setZcoord(double zcoord) {
        this.zcoord = zcoord;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getX_dir() {
        return x_dir;
    }

    public void setX_dir(double x_dir) {
        this.x_dir = x_dir;
    }

    public double getY_dir() {
        return y_dir;
    }

    public void setY_dir(double y_dir) {
        this.y_dir = y_dir;
    }

    public double getZ_dir() {
        return z_dir;
    }

    public void setZ_dir(double z_dir) {
        this.z_dir = z_dir;
    }
}
