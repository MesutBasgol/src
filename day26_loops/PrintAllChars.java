package day26_loops;

public class PrintAllChars {
    public static void main(String[] args) {
        String word = "selenium";
        //System.out.println(word.length());
        for (int i = word.length()-1; i >=0 ; i--){
            System.out.println(i + "-" +word.charAt(i));
        }
    }
}
