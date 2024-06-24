import java.util.*;

public class hwp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rowlen = sc.nextInt();
        System.out.println("Enter no. of columns");
        int collen = sc.nextInt();
        int[][] arr2d = new int[rowlen][collen];
        System.out.println("Fill your Array");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }
        int rows = 0;
        int rowe = rowlen - 1;
        int cols = 0;
        int cole = collen - 1;
      
        while(rows < rowe && cols < cole){
            for(int j = cols; j <= cole; j++){
                System.out.print(arr2d[rows][j] + " ");
            }
            rows++;
            for(int j = rows; j <= rowe; j++){
                System.out.print(arr2d[j][cole] + " ");
            }
            cole--;
            for(int j = cole; j >= cols; j--){
                System.out.print(arr2d[rowe][j] + " ");
            }
            rowe--;
            for(int j = rowe; j >= rows; j--){
                System.out.print(arr2d[j][cols] + " ");
            }
            cols++;
        }   
    }   

}
