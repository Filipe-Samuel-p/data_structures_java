package TAD.example1;

public class Implementation implements ContractPoint {

    @Override
    public void accessPoint(Point point) {
        System.out.println(point.getX());
        System.out.println(point.getY());
    }

    @Override
    public Point createPoint(double x, double y) {
        Point point = new Point(x,y);
        return point;
    }

    @Override
    public void definePoint(Point point, double x, double y) {
        point.setX(x);
        point.setY(y);
    }

    @Override
    public double distancePoints(Point p1, Point p2) {
        double x = p1.getX() - p2.getX();
        double y = p1.getY() - p2.getY();
        double d = Math.pow(x,2) + Math.pow(y,2);
        return Math.sqrt(d);
    }


    @Override
    public void freePoint(Point point) {
        point = null;
    }
}
