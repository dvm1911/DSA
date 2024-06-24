
public class getBit {
    public static void main(String[] args) {
        //Bit operators
        /*& operator
         * 0101 & 0110 = 0100, 1 & 0 = 0, 1 & 1 = 1, 0 & 0 = 0;
         * | operator
         * 0101 | 0110 = 0111, 1 | 0 = 1, 1 | 1= 1, 0 | 0 = 0;
         * ^ operator
         * 0101 ^ 0110 = 0011, 1 ^ 0 = 1, 1 ^ 1=0, 0 ^ 0 = 0;
         */

        //X<<Y states convert X into binary and shift binary X, Y times towards left and leave zeros on empty places. 
        //Eg. X=5 and Y=2, X<<Y = (101)<<2 = 10100 = 20.
        int leftShift = 5<<2;
        System.out.println(leftShift);
        //X>>Y states convert X into binary and shift binary X, Y times towards right and leave zeros on empty places.
        //Eg. X=7 and Y=1, X>>Y = (111)>>1 = 011 = 3.
        int rightShift = 7>>1;
        System.out.println(rightShift);
        
        //Get Bit
        /*Find 4th bit of decimal integer 5 */
        int nGet = 5; //0101
        int posGet = 3;
        int bitMaskGet = 1<<posGet;
        if((bitMaskGet & nGet) == 0) {
        System.out.println("bit was zero");
        } else {
        System.out.println("bit was one");
        }

        //Set Bit
        /*Set 2nd bit to 1 in 5*/
        int nSet = 5; //0101
        int posSet = 1;
        int bitMaskSet = 1<<posSet;
        int newNumberSet = bitMaskSet | nSet;
        System.out.println(newNumberSet);
        /*Set second  */
        
        //Clear Bit
        /*Clear 3rd bit to 0 in 5 */
        int nClear = 5; //0101
        int posClear = 2;
        int bitMaskClear = 1<<posClear;
        int newBitMaskClear = ~(bitMaskClear);
        int newNumberClear = newBitMaskClear & nClear;
        System.out.println(newNumberClear);

    }
    
    
}
