package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while (isHungry) {
            //bananas++;
            System.out.println("eat banana - " + ++bananas);
            //isHungry = bananas == countToFull ? false : true;
            if (bananas == countToFull) {
                System.out.println("You ate enough bananas");
                isHungry = false;
            }
        }
//        while (isHungry && bananas < countToFull) {
//            //bananas++;
//            System.out.println("eat banana - " + ++bananas);
//        }
        }

}
