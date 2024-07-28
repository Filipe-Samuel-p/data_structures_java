package TAD.exe1_cylinder;

public class Cylinder implements CylinderContract {

    private Double height;
    private Double radius;

    public Cylinder(){}

    public Cylinder(Double height, Double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * getRadius() * (getHeight() + getRadius());
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius,2) * height;
    }
}
