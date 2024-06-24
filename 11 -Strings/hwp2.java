import java.util.*;

public class hwp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Srting");
        String inStr = sc.nextLine();
        String resInt = "";
        for(int i = 0; i < inStr.length(); i++){
            if(inStr.charAt(i) == 'e'){
                resInt = resInt + "i";
            } else{
                resInt = resInt + inStr.charAt(i);
            }
            
        }
        System.out.print(resInt);
    }
}