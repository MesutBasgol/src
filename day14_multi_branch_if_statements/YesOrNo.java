package day14_multi_branch_if_statements;
//import java.util.Scanner;
public class YesOrNo {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to delete this file?");
        //String selection = scan.next();
        char selection = 'y';
        boolean answer;
        if (selection == 'y'){
            System.out.println("Your file will be deleted");
            answer = true;
        }else {
            System.out.println("file deletion cancelled");
            answer = false;
        }
        System.out.println("Did file get deleted? - " + answer);

    }
}
