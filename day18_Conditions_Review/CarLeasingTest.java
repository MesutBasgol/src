package day18_Conditions_Review;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "A";
        double listPrice = 0.0;
        if (make.equals("Mercedes")){
            if (model.equals("E")){
                listPrice = 500.0;
            }else{
                listPrice = 400.0;
            }
        }
    }
}
