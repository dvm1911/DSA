import java.util.Scanner;

public class hpw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i >= 0; i ++){
            System.out.println("To proceed ahead enter 1/ to stop 0");
            System.out.println("Do you wish to continue");
            int c1 = sc.nextInt();
            if(c1 == 1){
                System.out.println("Are you comfortable sharing your marks, 1 - yes/ 2 - no");
                int c2 = sc.nextInt();
                if(c2 == 1){
                    System.out.println("Enter your marks");
                    int c3 = sc.nextInt();
                    if (c3 >=90) {
                        
                    } else if (c3 >= 60){
                        System.out.println("This is also Good");
                    } else {
                        System.out.println("This is Good as well \nBecause marks don’t matter but our effort does.");
                    }
                } else if(c2 == 0){
                    System.out.println("stoping menu");
                    break;
                } else {
                    System.out.println("Enter only 1 or 0");
                }

            } else if(c1 == 0){
                System.out.println("Returning to previous option");
            } else {
                System.out.println("Enter only 1 or 0");
            }
        }
    }
}
