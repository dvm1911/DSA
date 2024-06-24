import java.util.*;

public class hwp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of thea Array");
        int size = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int inArr[] = new int[size];
        System.out.println("Enter inputs in Array");
        for (int i = 0; i< size; i++){
            inArr[i] = sc.nextInt();
        }
        for (int i = 0; i< size; i++){
            if(inArr[i] < min){
                min = inArr[i];
            }
            if(inArr[i] > max){
                max = inArr[i];
            }
        }
        System.out.println("Minimum value in array - " + min);
        System.out.println("Maximum value in array - " + max);
    
    }
    

}
