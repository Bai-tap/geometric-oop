package geomatric.Circle;

import geomatric.Geometric;

public class Circle extends Geometric{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with radius is: " + radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "color='" + super.getColor() + '\'' +
                ", filled='" + super.getFilled() + '\'' + ", radius = " +
                '}';
    }
}
