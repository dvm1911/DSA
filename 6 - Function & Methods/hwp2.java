import java.util.Scanner;

public class hwp2 {
     public static void even(int a){
        if(a%2 == 0){
        System.out.println(a + " is a even number");}
        else {
            System.out.println(a + " is not a even number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check if its even or not");
        int num = sc.nextInt();
        even(num);
    }
}
