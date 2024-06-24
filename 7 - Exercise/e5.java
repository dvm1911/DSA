import java.util.*;

public class e5 {
    public static void isAdult(int a){
        if(a > 18){ System.out.println("You are an adult and eligible for vote");}
        else{System.out.println("You still a kid bitch wait you dick to be 18years old");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        isAdult(a);
        
    }
}
