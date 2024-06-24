import java.util.Scanner;

public class e7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int zero = 0;
        int neg = 0;
        while( ){
            System.out.println("Enter " + i + " no.");
            int k = sc.nextInt();
            if (k > 0) {
                pos = pos + 1;
            } else if(k == 0){
                zero = zero + 1;
            } else if(k < 0){
                neg = neg + 1;
            }
        }
        System.out.println("No. of Positive = " + pos);
        System.out.println("No. of Zeros = " + zero);
        System.out.println("No. of Negatives = " + neg);
    }
}
