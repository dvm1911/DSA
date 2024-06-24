
public class lowrecursion {
    public static int power(int n, int m){
        if(m == 1){
            return n;
        }
        if(m%2 == 0){
            int p_1 = power(n, m/2);
            int p = n*p_1;
            int res = p*p;
            return res; 
        }else{
            int p_1 = power(n, (m - 1)/2);
            int p = n*p_1;
            int res = p*p*n;
            return p;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 4));

    }
}
