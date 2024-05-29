package bai06.ex3;


import java.util.List;
import java.util.ArrayList;

public class Polygon {
    private final List<Point> points;
    private final Bundle bundle;

   public Polygon(Bundle bundle){
       this.bundle = bundle;
       this.points = new ArrayList<>();
   }
    public void addPoint(Point point){
        points.add(point);
   }

    public void rotate(double angle){
        for (Point point : points) {
            point.rotate(angle);
        }
    }
    public void scale(double factor){
        for (Point point : points){
            point.scale(factor);
        }
    }

    public String toString(){
        return "Points: " + points + "," + "Bundle: " + bundle;
    }

}
