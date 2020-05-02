package introductionJava.lessons.lesson13.hw_18_SwimingPool;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}