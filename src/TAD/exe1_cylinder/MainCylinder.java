package TAD.exe1_cylinder;

public class MainCylinder {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(5.0,3.0);
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("radius: " + cylinder.getRadius());
        System.out.printf("Total area: %.2f\n",cylinder.area());
        System.out.printf("Volume: %.2f",cylinder.volume());

    }
}
