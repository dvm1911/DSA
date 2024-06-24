import java.util.*;

public class hwp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your email id");
        String str = sc.nextLine();
        StringBuilder em = new StringBuilder(str);
        int atidx = em.indexOf("@", 0);
        em.delete(atidx, em.length());
        System.out.println(em);
    }
}
