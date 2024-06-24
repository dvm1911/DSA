import java.util.*;

public class array2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. Rows of 2D - Array");
        int rows = sc.nextInt();
        System.out.println("Enter no. of coloumns");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number you want to search");
        int x = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.println(x + " Number found at - " + "( " +i +", "+ j + ")");
                }
            }
        }
        
    }
}
