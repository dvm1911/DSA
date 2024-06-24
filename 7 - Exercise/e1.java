import java.util.Scanner;

public class e1 {
    public static float average(float a, float b, float c){
        float avg = (a + b + c)/3.000f;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st of 3 numbers to find its average");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd of 3 numbers to find its average");
        float b = sc.nextFloat();
        System.out.println("Enter 3rd of 3 numbers to find its average");
        float c = sc.nextFloat();
        System.out.println("The average of three numbers is" + average(a, b, c));
    }
    
}
