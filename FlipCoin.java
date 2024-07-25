package Basics.com;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of flips: ");
        int flips = sc.nextInt();
        double random = Math.random();
        for(int i = 1; i <= flips; i++) {
            if(random >= 0 && random < 0.5) {
                head++;
            }
            if(random >= 0.5 && random <= 1){
                tail++;
            }
        }
        System.out.println("Number of time Head Appeared: " + head);
        System.out.println("Number of time Tail Appeared: " + tail);
        double head_percentage = ((double)head / (double)flips) *100;
        double tail_percentage = ((double)tail / (double)flips) *100;
        System.out.println("Therefore Head percentage: " + head_percentage);
        System.out.println("Therefore Tail percentage: " + tail_percentage);

    }
}
