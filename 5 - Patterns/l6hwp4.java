import java.util.Scanner;

public class l6hwp4 {
    public static void main(String[] args) {
        //Print half Pyramid
        /**    1 
         *    1 2
         *   1 2 3
         *  1 2 3 4
         * 1 2 3 4 5
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prefered height of triangle");
        int h = sc.nextInt();
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= h - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
