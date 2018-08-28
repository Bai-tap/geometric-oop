import geomatric.Circle.Circle;
import geomatric.Shape;
import geomatric.Rectangle.Rectangle;

public class Application {
    public static void main(String[] args) {
        Shape geometric = new Shape();
        Circle c = new Circle(8, "blue", true);
        System.out.println(c.toString());
        System.out.println(c.getArea());
        System.out.println(c.getDiameter());
        System.out.println(c.getPerimeter());
        System.out.println(c.getRadius());
        System.out.println();

        Rectangle r = new Rectangle(4, 9, "yellow", false);
        System.out.println(r.toString());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
