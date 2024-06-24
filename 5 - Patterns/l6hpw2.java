import java.util.Scanner;

public class l6hpw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of Rhombus");
        int wid = sc.nextInt();
        for(int i = 1; i <= wid - 1; i++){
            System.out.print(" ");
        }
        for(int i = 1; i <= wid; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= wid - 2; i++){
            for(int j = 1; j <= wid - i - 1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 1; j <= wid - 2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i = 1; i <= wid; i++){
            System.out.print("*");
        }
    }
}
