import java.util.*;
public class hwp3 {
    public static void main(String[] args) {
        /*Write a program to count the number of 1’s in a binary representation of the number. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to count binary 1's");
        int n = sc.nextInt();
        int i = 0;
        int count = 0;
        while(n >= 1<<(i)){
            if((n & 1<<i) == 1<<i){              
                count++;
            }
            i++;
        }
        System.out.println("Number of 1's in binary " + n + " are " + count);
    }
    
}
