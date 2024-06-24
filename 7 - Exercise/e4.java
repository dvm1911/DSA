import java.util.*;

public class e4 {
    public static void circle(float rad){
        float pi = 3.14f;
        float area = pi*(rad*rad);
        float circ = 2.0f*(pi*rad);
        System.out.println("Area of the circle: " + area + "\nCircumference of the circle: " + circ);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int rad = sc.nextInt();
        circle(rad);    
    }
}
