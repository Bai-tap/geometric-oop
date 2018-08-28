import geomatric.Circle.Circle;
import geomatric.Geometric;
import geomatric.Rectangle.Rectangle;

public class Application {
    public static void main(String[] args) {
        Geometric geometric = new Geometric();
        Circle c = new Circle(8, "blue", "khong biet");
        System.out.println(c.toString());
        System.out.println(c.getArea());
        System.out.println(c.getDiameter());
        System.out.println(c.getPerimeter());
        System.out.println(c.getRadius());
        System.out.println();

        Rectangle r = new Rectangle(4, 9, "yellow","khong biet");
        System.out.println(r.toString());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
