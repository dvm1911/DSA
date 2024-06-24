import java.util.Scanner;

public class hwp3 {
         public static void table(int a){
        for(int i = 1; i <= 10; i++){
            System.out.println(a + " x " + i + " = " + (i*a) );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print its table");
        int num = sc.nextInt();
        table(num);
    }
}
