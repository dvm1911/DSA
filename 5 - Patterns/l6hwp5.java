import java.util.Scanner;

public class l6hwp5 {
    public static void main(String[] args) {
        // Inverted Pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prefered height of triangle");
        int h = sc.nextInt();
        for(int i = 1; i <= h; i++){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= h - i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
    }
}
}
