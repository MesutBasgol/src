package day14_multi_branch_if_statements;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your language");
        int language = scan.nextInt();
        if (language == 1){
            System.out.println("Hello, thank you for calling");
        }else if (language == 2){
            System.out.println("hola, gracias para llamar");
        }else if (language == 3){
            System.out.println("merhaba, aradiginiz icin tesekkur ederiz");
        }else if (language == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if (language == 5){
            System.out.println("merci, pour votre appel");
        }else {
            System.out.println("Lets talk Java");
        }

    }
}
