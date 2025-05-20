import shape.Square;
import shape.Triangle;
import shape.Circle;
public class Main {
public static void main(String[]args) {
Square square=new Square(5);
Triangle triangle=new Triangle(4,6);
Circle circle=new Circle(3);
System.out.println("Square area:"+square.getArea());
System.out.println("Triangle area:"+triangle.getArea());
System.out.println("Circle area:"+circle.getArea());
}
}
