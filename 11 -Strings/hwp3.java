import java.util.*;

public class hwp3 {
    public static int bAtStr(String a){
        int at = 0;
        for(int i =0; i < a.length(); i++){
            if(a.charAt(i) == '@'){
                at = i;
            }
        }   return at;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email-id");
        String inid = sc.next();
        String userName = inid.substring(0, bAtStr(inid));
        System.out.println("Your User Name");
        System.out.println(userName);

    }
    
}
