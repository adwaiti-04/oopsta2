package test;
class Shape {
 double getPerimeter() {
     System.out.println("Calculating perimeter in Shape class...");
     return 0;
 }

 double getArea() {
     System.out.println("Calculating area in Shape class...");
     return 0;
 }
}
class Circle extends Shape {
 private double radius;
  public Circle(double radius) {
     this.radius = radius;
 }
 double getPerimeter() {
     return 2 * Math.PI * radius;
 }
 double getArea() {
     return Math.PI * radius * radius;
 }
}
public class Main {
 public static void main(String[] args) {
     Shape genericShape = new Shape();
     genericShape.getPerimeter();
     genericShape.getArea();

     Circle circle = new Circle(5.0);
     System.out.println("Circle Perimeter: " + circle.getPerimeter());
     System.out.println("Circle Area: " + circle.getArea());
 }
}
