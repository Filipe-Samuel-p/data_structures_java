package TAD.example1;

public interface ContractPoint {

    Point createPoint(double x,double y);
    void freePoint(Point point);
    void accessPoint(Point point);
    void definePoint(Point point,double x, double y);
    double distancePoints(Point p1, Point p2);

}
