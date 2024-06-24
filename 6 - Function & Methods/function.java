import java.util.Scanner;

public class function {
    //nameprint
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    //addition of two numbers
    public static void calculate(int x,int y){
        int z = x + y;
        System.out.println(z);
        return;
    }
    //Multiply
    public static int mul(int x, int y){
        int pro = x * y;
        return pro;
    }

    //factorial
    public static void factorial (int x){
        for(int i = x; i >= 1; i--){
            int fact = x*(i - 1);
            x--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name");
        String name = sc.nextLine();
        System.out.println("your name is"); 
        printMyName(name);
        
        System.out.println("First no.");
        int a = sc.nextInt();
        System.out.println("Second no.");
        int b = sc.nextInt();
        calculate(a,b);

        System.out.println("First no.");
        int c = sc.nextInt();
        System.out.println("Second no.");
        int d = sc.nextInt();
        int pro = mul(c,d);
        System.out.println(pro);

    }
}
