import java.util.*;

public class e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of your Fibonacci series");
        int f = sc.nextInt();
        int j = 0;
        int k = 1;
        for(int i = 1; i <= f; i++){ 
            System.out.print(j + " ");           
            int c = j + k;
            j = k;
            k = c;
            

        }
    }
    
}
