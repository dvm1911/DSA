import java.util.Scanner;

public class hwp1 {
    public static void main(String[] args) {
        /**
         * 1. Make a Calculator. Take 2 numbers (a & b) from the user and an
            operation as follows :
            1 : + (Addition) a + b
            2 : - (Subtraction) a - b
            3 : * (Multiplication) a * b
            4 : / (Division) a / b
            5 : % (Modulo or remainder) a % b
            Calculate the result according to the operation given and
            display it to the user
         */
     Scanner pl = new Scanner(System.in);
     System.out.println("Enter 1st number");
     int a = pl.nextInt();
     System.out.println("Enter 2nd number");
     int b = pl.nextInt();
     System.out.println("Enter code value of operation \n1: + (Addition) \n2: - (Subtraction)\n3: * (Multipilication) \n4: / Division\n5: % (Modulo)\n");
     int op = pl.nextInt();
     switch (op) {
        case 1: System.out.println(a + b);
            
            break;
        case 2: System.out.println(a - b);
            break;
        case 3: System.out.println(a * b);
            break;
        case 4: System.out.println(a / b);
            break;
        case 5: System.out.println(a % b);
            break;
     
        default:
            break;
     }
    }
}
