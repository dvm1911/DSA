public class medrecursion {
    //  //Hanoi Tower
    //  public static void hanoiTower(int n, String src, String hel, String des) {
    //     if(n == 1){
    //         return "Transfer disk from " + src + "to " + des;  
    //     }
    //     System.out.println("Transfer");
    // }

    public static boolean strictinc (int idx, int[] arr){
        if(idx == arr.length - 1){
                return true;}            
        
        if(arr[idx] >= arr[idx + 1]){
            return false;
        }
        return strictinc ((idx + 1), arr);
        
    }
    public static void main(String[] args) {
       int a[] = {1, 2, 3, 4, 4};
       int i = 0;
       System.out.println(strictinc(i, a));
       
    }
}
