public class insertionsort {
    public static void printArray(int[] arr){
        System.out.print("[ " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.print(" ]" );
    }
    public static void main(String[] args) {
        int arr[] = {7, 18, 9, 13, 11, 4};
        for(int i = 1; i < arr.length; i++){
           int rep = arr[i];
            int j = i - 1;
            while(j >= 0 && rep < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = rep;
        }
        printArray(arr);
    }
}
