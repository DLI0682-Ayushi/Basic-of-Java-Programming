package Basics.com;
import java.util.Scanner;
public class StringEqualOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string1 = input.nextLine();
        System.out.println("Enter a string: ");
        String string2 = input.nextLine();
        if (string1.equals(string2)) {
            System.out.println("The given string : " + "(" + string1+" and "+string2+ ")" + " are equal");
        }
        else {
            System.out.println("The given string : " + "(" + string1+" and "+string2+ ")" + " are not equal");
        }

    }
}
