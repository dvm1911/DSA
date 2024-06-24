import java.util.Scanner;

public class hpw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. till where you want to print even numbers");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
