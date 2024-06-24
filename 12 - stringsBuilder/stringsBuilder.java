import java.util.*;
public class stringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.insert(1, "ello");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("hell");
        sb1.append("o");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("hellow");
        sb2.delete(5, 6);
        System.out.println();
    }
}
