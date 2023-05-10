package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek School Address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("Address after update: " + cybertekAddress);
        System.out.println("Street info: " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
        newAddress.setStreet("7925 Jones Branch Dr Suite 2100");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("21180");
        System.out.println(newAddress);

        Address papaJohn = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA","21300");
        System.out.println("Papa John Pizza Address: " + papaJohn);
    }
}
