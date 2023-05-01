package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {

        /**
         for (initializations; conditions; updates){}
         * below is infinite loop with for loop
         for (;;){
         System.out.println("Java is fun!");
         }
         */
        //int i; we can define the variable inside for loop.
        for (int i = 0; i <= 5; i++){
            System.out.println("hello world - " + i);
        }
        for (int i=1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
