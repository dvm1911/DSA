import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int arrLen = sc.nextInt();
        int number[] = new int[arrLen];
        for(int i = 0; i < arrLen; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter Number you wish to search");
        int find = sc.nextInt();
        for (int i = 0;i < arrLen; i++){
            if(number[i] == find){
                System.out.println("Your number is at index - " + i);
            }
        }
    }
}
