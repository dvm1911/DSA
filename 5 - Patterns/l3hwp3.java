import java.util.Scanner;

public class l3hwp3 {
    public static void main(String[] args) {
        //Print Pascal’s Triangle.
        Scanner sc = new Scanner(System.in);
        System.out.println("Height of pascal triangle");
        int h = sc.nextInt();
        
        for(int i = 0; i <= h; i++){
            for(int j = 1; j <= h - i; j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num = num*(i - j)/(j + 1);                
            }

            System.out.println();
        }

    }
}
