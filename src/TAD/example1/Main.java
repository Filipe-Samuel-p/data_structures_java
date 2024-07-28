package TAD.example1;

public class Main {

    public static void main(String[] args) {

        Point p1,p2;
        ContractPoint pointTools = new Implementation();

        p1 = pointTools.createPoint(10,21);
        p2 = pointTools.createPoint(7,25);
        double distance = pointTools.distancePoints(p1,p2);
        System.out.println("Distance: " + distance);
        pointTools.freePoint(p1);
        pointTools.freePoint(p2);

    }
}
