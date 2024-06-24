import java.util.*;

public class e3 {
    public static void compare(int a, int b){
        if(a > b){ System.out.println(a + " is greater than " + b);}
        else{System.out.println(a+" is smaller than "+b);}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbe ryou want to compare");
        int a = sc.nextInt();
        System.out.println("Enter second number you want to compare");
        int b = sc.nextInt();
        compare(a, b);
        
    }
}
