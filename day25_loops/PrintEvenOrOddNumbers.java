package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
       String oddNumbers ="";
       String evenNumbers ="";
        for (int i=1; i<=10; i++){
            if (i%2 == 0){
                evenNumbers += i+" ";
            }else {
                oddNumbers += i + " ";
            }
            }
        System.out.println("Even numbers from 1 to 10 = " + evenNumbers);
        System.out.println("Odd numbers from 1 to 10 = " + oddNumbers);
    }
}
