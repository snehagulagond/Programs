/*********************************************************************************
Program-4: A class called MyPoint, which models a 2D point with x and y coordinates, is designed 
as follows:
● Two instance variables x (int) and y (int).
● A default (or "no-arg") constructor that construct a point at the default location of (0, 0).
● A overloaded constructor that constructs a point with the given x and y coordinates.
● A method setXY() to set both x and y.
● A method getXY() which returns the x and y in a 2-element int array.
● A toString() method that returns a string description of the instance in the format "(x, y)".
● A method called distance(int x, int y) that returns the distance from this point to another
 point at the given (x, y) coordinates
● An overloaded distance(MyPoint another) that returns the distance from this point to the 
given MyPoint instance (called another)
● Another overloaded distance() method that returns the distance from this point to the origin (0,0)
Develop the code for the class MyPoint. Also develop a JAVA program (called TestMyPoint) to test 
all the methods defined in the class.
******************************************************************/
class MyPoint
{
int x = 0;
int y = 0;
MyPoint() 
{ 
 x=0;
 y=0;
}
MyPoint(int x1, int y1)
{
x = x1;
y = y1;
}
 double distance()
{
return Math.sqrt(x*x + y*y);
}
 
 double distance(int x1, int y1)
{
return Math.sqrt( (x-x1)*(x-x1) + (y-y1)*(y-y1) );
}
double distance(MyPoint P)
{
int x1 = P.x;
int y1 = P.y;
 return Math.sqrt( (x-x1)*(x-x1) + (y-y1)*(y-y1) );
}
void setX(int x1)
{
x = x1;
}
int getX()
{
return x;
}
void setY(int y1)
{
y = y1;
}
int getY()
{
return y;
}
void setXY(int x1, int y1)
{
x = x1;
y = y1;
}
int[] getXY()
{
int a[] = new int[2];
a[0] = x;
a[1] = y;
return a;
}
public String toString()
{
return "(" + x + ", " + y + ")";
}
}
public class TestMyPoint
{
 public static void main(String[] args)
 {
 //--- Initialize using Constructors and Print as per toString() format------
 MyPoint P1 = new MyPoint(3, 4);
 MyPoint P2 = new MyPoint();
 
 System.out.println("Coordinates of P1"+ P1); 
 System.out.println("Coordinates of P2"+ P2); 
 
 //--- Compute distances using all overloaded functions ---
 System.out.println("Dist of P1 from Origin:" + P1.distance()); 
 System.out.println("Dist of P1 from Given Pt" + P1.distance(7,7)); 
 System.out.println("Dist of P1 from P2" + P1.distance(P2)); 
 
 //--- Usage of getXY() and setXY() ---
 System.out.println("Coordinates of P2 before setXY:"+ P2); 
 int b[] = new int[2];
 b = P2.getXY();
 P2.setXY(b[0]+1,b[1]+1);
 System.out.println("Coordinates of P2 after setXY:"+ P2); } 
 }