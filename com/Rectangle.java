package ClassAndObject.com;

public class Rectangle {
    public int length;
    public int breadth;
    public int height;

    public void area(int length,  int breadth, int height){
        double area = length * breadth * height;
        System.out.println("The area of your rectangle is: " +area +"m");

    }
    public void perimeter(int length,  int breadth, int height){
        double perimeter = length * breadth;
        System.out.println("The perimeter of your rectangle is: " +perimeter + "m");
    }
}
