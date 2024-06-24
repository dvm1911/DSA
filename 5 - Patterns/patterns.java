import java.util.*;

public class patterns {
    public static void main(String[] args) {
        //Lecture - 5

        //Description

        System.out.println("Codes for patterns \n1).(*) Rectangle Code: 1 \n2).(x) hollow Rectangle Code: 2 \n3).(^) Half pyramid Code: 3 \n4).(v) Inverted Half pyramid Code: 4 \n5).(*) Mirror Image of half Pyramid Code: 5 \n6).Number half Pyramid Code: \n7).Inverted half number pyramid Code: 7 \n8).101 triangle Code: 8 \n9).Floyd's Triangle Code: 9 \n10). Butterfly code:10 \n11).Rhombus Code: 11 \n12).Number pyramid Code: 12 \n13). Number pyramid with repeating digits Code: 13 \n14).Palindrome Code: 14 \n15).Diamond Code: 15");

        //Input
        Scanner pl = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
       
        for (int l=1; l > 0; l++) {
            System.out.println("Enter Code of pattern You want to print");
            int x = pl.nextInt();
            
        
        switch (x) {
            case 
            
            1:
                //print a rectangle
                //Use of Nested loops
                System.out.println("You have choosen (*) Rectangle pattern. \n Do You wish to continue? [Yes = 1/No = 2]");
                int ans1 = pl.nextInt();
                if (ans1 == 1) {
                    System.out.println("Select Number of Rows");
                    int row1 = sc.nextInt();
                    System.out.println("Select Number of Coloumns");
                    int col1 = sc.nextInt();

                    for( int i1 = 1; i1 <= row1; i1++) {
                    for( int j1 = 1; j1 <= col1; j1++) {
                    System.out.print("* ");
                    }
                    System.out.println();
                    }
                }                
                break;
            case 2: //print Hollow Rectangle
                    //Use of nested loops with condition statements
                    System.out.println("You have choosen (.) hollow Rectangle. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans2 = pl.nextInt();
                    if (ans2 == 1) {
                        System.out.println("Select Number of Rows");
                        int row2 = sc.nextInt();
                        System.out.println("Select Number of Coloumns");
                        int col2 = sc.nextInt();
                        for(int i2 = 1; i2 <= row2; i2++) {
                        for(int j2 = 1; j2 <= col2; j2++) {
                        if (i2 == 1 || j2 == 1 || i2 == row2 || j2 == col2) {
                        System.out.print("x ");
                     }
                        else{
                        System.out.print("  ");
                     }
                        }
                        System.out.println();
                     }
                    }
                    
                
                break;
            case 3:
                    //Half pyramid
                    //use outer loop var as inner loop limiter
                    System.out.println("You have choosen Half pyramid. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans3 = pl.nextInt();
                    if (ans3 == 1) {
                        System.out.println("Select Units of Hieght");
                        int row3 = sc.nextInt();
                        for(int i3 = 1; i3 <= row3; i3++) {
                        for (int j3 = 1; j3 <= i3; j3++) {
                        System.out.print("^ ");
                        }
                        System.out.println();
                        }
                    }
                  
                
                break;
            case 4:
                    //Inverted half pyramid
                    System.out.println("You have choosen Inverted half pyramid. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans4 = pl.nextInt();
                    if (ans4 == 1) {
                        System.out.println("Select Units of Hieght");
                        int row4 = sc.nextInt();
                        for(int j4 = row4; j4 >= 1; j4--){
                        for(int i4 = 1; i4 <= j4; i4++) {
                        System.out.print("v ");
                        }
                        System.out.println();
                        }
                    }
                   
                
                break;
            case 5:
                    //Mirror Image of half Pyramid
                    //two nestwd loops
                    System.out.println("You have choosen Mirror Image of half Pyramid. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans5 = pl.nextInt();
                    if (ans5 == 1) {
                        System.out.println("Select unit of hieghts");
                        int row5 = sc.nextInt();
                        for(int i5 = 1; i5 <= row5; i5++){
                        for(int j5 = 1; j5 <= row5-i5 ; j5++){
                        System.out.print(" ");
                        }
                        //memory is freed for j5 after for loop is terminated 
    
                        for(int j5 = 1; j5 <= i5; j5++){
                            System.out.print("*");
                           }
                           System.out.println();
                        }                
                    }
                   
                break;
            case 6:
                    //Print Number Pyramid
                    System.out.println("You have choosen half Number Pyramid. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans6 = pl.nextInt();
                    if (ans6 == 1) {
                        System.out.println("Select Units of Hieght");
                        int row6 = sc.nextInt();
                        for(int i6 = 1; i6 <= row6; i6++) {
                        for (int j6 = 1; j6 <= i6; j6++) {
                        System.out.print(j6 + " ");
                        }
                        System.out.println();
                        }
                    }
                   
                
                break;
            case 7:
                    //Inverted half number pyramid
                    System.out.println("You have choosen Inverted half number pyramid. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans7 = pl.nextInt();
                    if(ans7 == 1) {
                        System.out.println("Select Units of Hieght");
                        int row7 = sc.nextInt();
                        for(int j7 = row7; j7 >= 1; j7--){
                        for(int i7 = 1; i7 <= j7; i7++) {
                        System.out.print(i7 + " ");
                        }
                        System.out.println();
                        }
                    }
                    
                
                break;
            case 8:
                    //101 triangle
                    System.out.println("You have choosen * 101 triangle. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans8 = pl.nextInt();
                    if (ans8 == 1) {
                        System.out.println("Select Units of Hieght");
                        int row9 = sc.nextInt();
                        for(int i9 = 1; i9 <= row9; i9++) {
                        for (int j9 = 1; j9 <= i9; j9++){
                        if ((i9 + j9)%2 == 0) {
                        System.out.print(1 + "");
                        }
                        else{
                        System.out.print(0 + " ");
                        }
                        }
                        System.out.println();
                        }
                    }
                    
                break;
            case 9:
                    //Floyd's Triangle
                    System.out.println("You have choosen Floyd's Triangle. \n Do You wish to continue? [Yes = 1/No = 2]");
                    int ans9 = pl.nextInt();
                    if (ans9 == 1) {
                        System.out.println("Select Units of Hieght");
                        int row8 = sc.nextInt();
                        int k8 = 1;
                        for(int i8 = 1; i8 <= row8; i8++) {
                        for (int j8 = 1; j8 <= i8; j8++){
                        System.out.print(k8 + " ");
                        k8++;
                        }
                        System.out.println();
                        }
                        
                    }
                    
                break;
            case 10:
                    //Butterfly pattern
                    System.out.println("You have chosen butterfly \n Do You wish to continue? [Yes = 1/No = 2] ");
                    int ans10 = pl.nextInt();
                    if(ans10 == 1){
                        System.out.println("Enter Unit of hieght of butterfly");
                        int row10 = sc.nextInt();
                        for(int i10 = 1; i10 < row10; i10++){
                        for(int j10 = 1; j10 <= i10; j10++){
                        System.out.print("*");
                        }
                        for(int j10 = 1; j10 <= (2*(row10 - i10)); j10++){
                        System.out.print(" ");
                        }
                        for(int j10 = 1; j10 <= i10; j10++){
                        System.out.print("*");
                        }
                        System.out.println();
                        }
                        for(int i10 = row10; i10 >= 1; i10--){
                        for(int j10 = 1; j10 <= i10; j10++){
                        System.out.print("*");
                        }
                        for(int j10 = 1; j10 <= (2*(row10 - i10)); j10++){
                        System.out.print(" ");
                        }
                        for(int j10 = 1; j10 <= i10; j10++){
                        System.out.print("*");
                        }
                        System.out.println();
                        }
                        }
                    break;
            case 11: //Rhombus
                    System.out.println("You have chosen Rhombus. \nDo You wish to continue? [Yes = 1/No = 2] ");
                    int ans11 = pl.nextInt();
                    if(ans11 == 1){
                        System.out.println("Enter width of Rhombus");
                        int w11 = sc.nextInt();
                        for (int i11 = w11; i11 >= 1; i11--){
                            for(int j11 = i11; j11 >= 1; j11--) {
                                System.out.print(" ");
                            }
                            for(int j11 = 1; j11 <= w11; j11++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                case 12: //No. Pyramid
                        System.out.println("You have chosen Number Pyramid. \nDo You wish to continue? [Yes = 1/No = 2]");
                        int ans12 = sc.nextInt();
                        if(ans12 == 1){
                            System.out.println("Enter Hieght of your pyramid");
                            int h12 = sc.nextInt();
                            for(int j12 = 1; j12 <= h12; j12++){
                            for(int i12 = h12 - j12; i12 >=0; i12--){
                            System.out.print(" ");
                            }
                            for(int i12 = 1; i12 <= j12; i12++){
                            System.out.print(i12 + " ");
                            }
                            System.out.println();
                            } 
                            }
                case 13: //No. pyramid with repeating digits
                        System.out.println("You have chosen Number Pyramid with repeating digits. \nDo You wish to continue? [Yes = 1/No = 2]");
                        int ans13 = sc.nextInt();
                        if(ans13 == 1){
                            System.out.println("Enter Hieght of your pyramid");
                            int h13 = sc.nextInt();
                            for(int j13 = 1; j13 <= h13; j13++){
                            for(int i13 = h13 - j13; i13 >=0; i13--){
                            System.out.print(" ");
                            }
                            for(int i13 = 1; i13 <= j13; i13++){
                            System.out.print(j13 + " ");
                            }
                            System.out.println();
                            } 
                            }
                case 14: //Palindrome
                        System.out.println("You have chosen Palindrome. \nDo You wish to continue? [Yes = 1/No = 2]");
                        int ans14 = sc.nextInt();
                        if(ans14 == 1){
                            System.out.println("Enter Hieght of your palindrome");
                            int h14 = sc.nextInt();
                            for(int j14 = 1; j14 <= h14; j14++){
                                for(int i14 = 1; i14 <= h14 - j14; i14++){
                                System.out.print(" ");
                                }
                                for(int i14 = j14; i14 >= 1; i14--){
                                System.out.print(i14);
                                }
                                for(int i14 = 2;i14 <= j14; i14++){
                                    System.out.print(i14);
                                }
                                System.out.println();
                                } 
                        }
                case 15: //Diamond
                        System.out.println("You have chosen Diamond. \nDo You wish to continue? [Yes = 1/No = 2]");
                        int ans15 = sc.nextInt();
                        if(ans15 == 1){
                            System.out.println("Enter Hieght of Diamond");
                            int h15 = sc.nextInt();
                            for (int i15 = 1; i15 <= h15; i15++){
                                for(int j15 = 1; j15 <= h15 - i15; j15++){
                                System.out.print(" ");
                                }
                                for(int j15 = 1; j15 <= 2*i15 - 1; j15++){
                                System.out.print("*");
                                }
                                System.out.println();
                                }
                                for (int i15 = 1; i15 < h15; i15++){
                                for (int j15 = 1; j15 <= i15; j15++)
                                System.out.print(" ");
                                for(int j15 = 1; j15 <= 2*(h15-i15) - 1; j15++){
                                System.out.print("*");
                                }
                                System.out.println();
                            }


                        }
                    break;
                default:
                    break;
        }
            if ( x > 15){
                System.out.println("Please enter with specific code");
            }
        }
    }
}