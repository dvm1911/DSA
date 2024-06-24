import java.util.Scanner;

public class hwp1 {
    public static void prime(int a){
        if(a%2 != 0 && a%3 != 0 && a%5 != 0 && a%7 != 0){
        System.out.println(a + " is a prime number");}
        else {
            System.out.println(a + " is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check if its prime or not");
        int num = sc.nextInt();
        prime(num);
    }
}
