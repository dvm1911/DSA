import java.util.Scanner;

public class hwp1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array");
        int size = sc.nextInt();
        String[] inStr = new String[size];
        System.out.println("Input Your Strings");
        for(int i = 0; i < size; i++){
            inStr[i] = sc.next();
        }
        int len = 0;
        for(int i = 0; i < size; i++){
            len = len + inStr[i].length(); 
        }
        System.out.println("Length of all strings is - " + len);
    }
}
