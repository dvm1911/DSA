import java.util.Scanner;

public class hwp2 {
    public static void main(String[] args) {
        //Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

        //Use of scanner class to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int rad = sc.nextInt();
        float pi = 3.14f;
        float area = pi*(rad*rad);
        float circ = 2*pi*rad;
        System.out.println("Area of the circle: " + area + "\nCircumference of the circle: " + circ);
        
    }
}
