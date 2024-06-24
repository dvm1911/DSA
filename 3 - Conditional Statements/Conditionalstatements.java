import java.util.*;

public class Conditionalstatements {
    public static void main(String[] args) {
        //if statement
        int n1 = 3;
        if(n1%2 == 0){
            System.out.println("Even No.");
        }
        if(n1%2 != 0){
            System.out.println("Odd number");
        }
        
        
        //if-else statement (Change value of "n1" to change case)
        int n2 = 30;
        if(n2 > 18) {
        System.out.println("This is an adult");
        } else {
        System.out.println("This is not an adult");
        }
        
        
        //if-else-if statement (Change value of "n3" to change case)
        int n3 = 3;
        if(n3 == 1){
            System.out.println("January");
        }else if(n3 == 2){
            System.out.println("February");
        }else if(n3 == 3){
            System.out.println("March");
        }else if(n3 == 4){
            System.out.println("April");
        }else if(n3 == 5){
            System.out.println("May");
        }else if(n3 == 6){
            System.out.println("June");
        }else if(n3 == 7){
            System.out.println("July");
        }else if(n3 == 8){
            System.out.println("August");
        }else if(n3 == 9){
            System.out.println("September");
        }else if(n3 == 10){
            System.out.println("October");
        }else if(n3 == 11){
            System.out.println("November");
        }else if(n3 == 12){
            System.out.println("December");
        }
    


        //switch (Change value of "n4" to change case)
        int n4 = 1;
        switch(n4) {
        case 1 :
        System.out.println("Monday");
        break;
        case 2 :
        System.out.println("Tuesday");
        break;
        case 3 :
        System.out.println("Wednesday");
        break;
        case 4 :
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6 :
        System.out.println("Saturday");
        break;
        default :
        System.out.println("Sunday");

    }
}
}
   
