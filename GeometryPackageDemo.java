package geometry_package_program;

import geometry_package_program.geometry.Circle;
import geometry_package_program.geometry.Rectangle;
import geometry_package_program.geometry.Triangle;

public class GeometryPackageDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(3.3);
        System.out.println("Area of circle: "+circle.getArea());
        System.out.println("Perimeter of circle: "+circle.getPerimeter());

        Triangle triangle = new Triangle(10, 20, 30);
        System.out.println("Area of triangle: "+triangle.getArea());
        System.out.println("Perimeter of triangle: "+triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: "+rectangle.getPerimeter());
        System.out.println("Perimeter of rectangle: "+rectangle.getArea());

    }
}
