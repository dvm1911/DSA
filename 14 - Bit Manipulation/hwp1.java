import java.util.*;

public class hwp1 {
    public static void main(String[] args) {
        /* Write a program to find if a number is a power of 2 or not. upto 2^10
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check as 2's Exponential");
        int num = sc.nextInt();
        int count = 0;
        int i = 0;
        while(num >= 1<<(i)){
            if((num & 1<<i) == 1<<i){              
                count++;
            }
            i++;
        }
        if(count == 1){
            System.out.println("Number is exponential of 2");
        } else {
            System.out.println("Number is not a exponential of 2");
        }

    }
    
}
