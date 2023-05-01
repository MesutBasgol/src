package day05_primitives_concatenation;

public class PrimitivesExample { // if you want to rename, go to refactor
    public static void main (String [] args) {
        // following are maximum ranges of primitives
        //****WHOLE NUMBERS/INTEGER
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 8946744073709551616L; // We add L to the end.
        // **** DECIMAL NUMBERS/ FLOATING POINT TYPES
        float floatValue = 2345.45F; // We add F to the end.
        double doubleValue = 456598656987.45; //456987.45D is also valid.
        //**** CHARACTER TYPE
        char charValue = '&'; //Single character
        //**** BOOLEAN = true or false
        boolean booleanValue = true;
        boolean booleanValue2 = false;

        //PRINT VARIABLE VALUES
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
        System.out.println(booleanValue2);
    }
}
