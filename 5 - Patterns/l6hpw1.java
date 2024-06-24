import java.util.Scanner;

public class l6hpw1 {
    public static void main(String[] args) {
        //Holow Butterfly
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of your butter fly");
        int len = sc.nextInt();
        //first half
        for(int i = 1; i <= len; i++){
            System.out.print("*");
            for(int j = 3; j <= i; j++){
                System.out.print(" ");
            }
            if(i > 1){System.out.print("*");}
            for(int j = 1; j <= 2*(len - i); j ++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 3; j <= i; j++){
                System.out.print(" ");
            }
            if(i > 1){System.out.print("*");}
            System.out.println();          
        }
        //Second Half
        for(int i = len; i >= 1; i--){
            System.out.print("*");
            for(int j = i; j >= 3; j--){
                System.out.print(" ");
            }
            if(i > 1){System.out.print("*");}
            for(int j = 2*(len - i); j >= 1; j --){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = i; j >= 3; j--){
                System.out.print(" ");
            }
            if(i > 1){System.out.print("*");}
            System.out.println();          
        }
        }
}
