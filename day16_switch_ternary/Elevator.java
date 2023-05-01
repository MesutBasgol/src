package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 1;
        switch (floorNumber){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Fllyn, BofA, Stake House");
                break;
            default:
                System.out.println("Invalid floor - " + floorNumber);
        }
        if (floorNumber ==1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNumber == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNumber == 3){
            System.out.println("Floor 3 selected. Companies: Fllyn, BofA, Stake House");
        }else {
            System.out.println("Invalid floor - " + floorNumber);
        }
    }
}
