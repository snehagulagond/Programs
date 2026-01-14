Prog-6: Develop a JAVA program to create an abstract class Shape with abstract methods 
calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the 
respective methods to calculate the area and perimeter of each shape
******************************************************************************/
import java.lang.Math;
abstract class Shape 
{
 abstract void calculateArea();
 abstract void calculatePerimeter();
}
//--- A Triangle Class, Which Inherits from the Shape Class ---
class Triangle extends Shape 
{
 double a, b, c;
 Triangle(double x, double y, double z)
 {
 a = x;
 b = y;
 c = z;
 System.out.println("\na="+a + "\tb="+ b + "\tc="+ c);
 }
 
 void calculateArea()
 {
 double A, s = (a+b+c)/2.0;
 A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
 System.out.println("Area of Triangle=" + A);
 }
 
 void calculatePerimeter()
 {
 System.out.println("Perimeter of Triangle=" + (a+b+c));
 }
}
 //---- A Circle Class, Which Inherits from the Shape Class ----
class Circle extends Shape 
{
 double r;
 Circle(double x)
 {
 r = x;
 System.out.println("Radius="+r);
 }
void calculateArea()
 {
 System.out.println("Area of Circle=" + (3.14*r*r));
 }
 
 void calculatePerimeter()
 {
 System.out.println("Perimeter of Circle=" + (2*3.14*r));
 }
 }
 public class Main 
{
 public static void main(String[] args) 
 {
 Circle C = new Circle(10);
 C.calculateArea();
 C.calculatePerimeter();
 
 Triangle T = new Triangle(6,8,10);
 T.calculateArea();
 T.calculatePerimeter();
 }
}