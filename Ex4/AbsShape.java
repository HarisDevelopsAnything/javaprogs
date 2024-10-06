import java.util.*;
abstract class Shape{
    double area;
    double perimeter;
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape{
    double r;
    Circle(double radius){
        r= radius;
    }
    void calculateArea(){
        area= 3.14*r*r;
    }
    void calculatePerimeter(){
        perimeter= 2*3.14*r;
    }
    void display(){
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+ perimeter);
    }
}
class Triangle extends Shape{
    double b;
    double h;
    Triangle(double base, double height){
        b= base;
        h= height;
    }
    void calculateArea(){
        area= b*h/2;
    }
    void calculatePerimeter(){
        perimeter= 2*h+b;
    }
    void display(){
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+ perimeter);
    }
}
class AbsShape{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        int base= sc.nextInt();
        System.out.println("Enter the height: ");
        int height= sc.nextInt();
        Triangle tr= new Triangle(base, height);
        System.out.println("Enter the radius of circle: ");
        int r= sc.nextInt();
        Circle c= new Circle(r);
        tr.calculateArea();
        c.calculateArea();
        tr.calculatePerimeter();
        c.calculatePerimeter();
        tr.display();
        c.display();
    }
}
