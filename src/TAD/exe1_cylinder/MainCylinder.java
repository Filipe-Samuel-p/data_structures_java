package TAD.exe1_cylinder;


public class MainCylinder {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(5.0,3.0);
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("radius: " + cylinder.getRadius());
        System.out.println("Total area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());

    }
}
