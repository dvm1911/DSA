import java.util.*;

public class selectionsort {
    public static void printArray(int[] arr){
        System.out.print("[ " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.print(" ]" );
    }
    public static void main(String[] args) {
     int arr[] = { 8, 12, 36, 11, 20, 2};
     for(int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j ++){
            if(arr[i] > arr[j]){
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;              
            }
        }
     }   
     printArray(arr);
    }    
}
