import java.util.*;

public class hwp2 {
    public static void main(String[] args) {
        /*Write a program to toggle a bit a position = “pos” in a number “n” */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to toggle");
        int n = sc.nextInt();
        System.out.println("Enter position you want to toggle bit");
        int pos = sc.nextInt();
        if((n & 1<<(pos - 1)) == 0){
            int newN = (n | 1<<(pos-1));
            System.out.println(newN);
        } else {
            int newN = (n & ~(1<<(pos - 1)));
            System.out.println(newN);
        }
    }
}
