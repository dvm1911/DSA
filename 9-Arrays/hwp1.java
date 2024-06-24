import java.util.*;

public class hwp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        int size = sc.nextInt();
        int inArr[] = new int[size];
        System.out.println("Enter inputs in Array");
        for (int i = 0; i< size; i++){
            inArr[i] = sc.nextInt();
        }
        System.out.println("Enter no.you want to search");
        int ser = sc.nextInt();
        for (int i = 0; i< size; i++){
            if(inArr[i] == ser){
                System.out.println(ser + " is at index: " + i);
            }
        }
    }
}