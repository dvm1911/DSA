import java.util.*;

public class Bubblesort {
    public static void printArray(int[] arr){
        System.out.print("[ " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.print(" ]" );
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length;
        int loopval = (n*n - n)/2; 
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - j - 1; j++){
                if(arr[j] > arr[j + 1]){
                   int a = arr[j];
                   arr[j] = arr[j+1];
                   arr[j + 1] = a; 
                }
            }
        }
    }
}
