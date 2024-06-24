import java.util.*;

public class e2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. till odd numbers you want to print");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }

    }
    
}
