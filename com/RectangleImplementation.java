package ClassAndObject.com;
import java.util.Scanner;
public class RectangleImplementation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle in meters: ");
        int breadth = scanner.nextInt();
        System.out.println("Enter the height of the rectangle in meters: ");
        int height = scanner.nextInt();
        System.out.println("Enter the length of the rectangle in meters: ");
        int length = scanner.nextInt();
        rectangle.area( length,   breadth,  height);
        rectangle.perimeter( length,   breadth,  height);
    }
}
