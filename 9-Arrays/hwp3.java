import java.util.*;


public class hwp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int inArr[] = new int[size];
        System.out.println("Enter inputs in Array");
        for (int i = 0; i< size; i++){
            inArr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 1; i< size; i++){
            if(inArr[i] < inArr[i - 1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
