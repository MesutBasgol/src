package day37_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123"); // POSITIVE TEST
        loginVoid("cybertek", "answer"); // NEGATIVE TEST
        System.out.println(login("cybertekStudent","abc123"));

        if (login("cybertekStudent","abc123")){
            System.out.println("Login successful, welcome CybertekStudent!");
        }else {
            System.out.println("Incorrect username or password, try again!");
        }
    }
    public static void loginVoid (String username, String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (secretUsername.equalsIgnoreCase(username) && secretPassword.equals(password)){
            System.out.println("Login successful, welcome CybertekStudent!");
        }else {
            System.out.println("Incorrect username or password, try again!");
        }
    }
    public static boolean login (String username, String password){
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        //return secretUsername.equalsIgnoreCase(username) && secretPassword.equals(password);
        if (secretUsername.equalsIgnoreCase(username) && secretPassword.equals(password)){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isEmpty (String str){
        if (str.isEmpty()){
            return true;
        }
        return false;
    }

    public static String reverse (String str) {
        String reverse ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
