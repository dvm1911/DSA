import java.util.*;
public class hwp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of matrix");
        int rows = sc.nextInt();
        System.out.println("Enter no. of coloumns of matrix");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Fill the matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of the matrix");
        int[][] tMatrix = new int[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                tMatrix[i][j] = matrix[j][i];
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(tMatrix[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
