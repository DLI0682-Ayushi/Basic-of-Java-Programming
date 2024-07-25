package Basics.com;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 32 && num < 0) {
            System.out.println("OVERFLOW !!!!!!!");
        } else {
            for (int i = 1; i <= num; i++) {
                double value = Math.pow(2, i);
                if (value < num) {
                    int val = (int) value;
                    System.out.println("2^" + i + "=" + val);
                }
            }
        }
    }
    }

