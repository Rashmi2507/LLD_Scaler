package designpattern.structural.flyweight.after;

public class FlyingBullet {
    private double xcoord;
    private double ycoord;
    private double zcoord;
    private double speed;
    private BulletStatus bulletStatus;
    private long userId;
    private double x_dir;
    private double y_dir;
    private double z_dir;
    private Bullet bullet;

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

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
