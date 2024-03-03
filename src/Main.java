import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Route r=new Route("Home","Mall",50);
        Route r2=new Route("Home","Garden",60);

        Car car1=new Car("123",r,2);
        Car car2=new Car("666",r2,3);

        // Create passengers using ArrayList
        ArrayList<Passenger> passengers = new ArrayList<>();
        Passenger pass = new Sub_pass("Ahmed", "1", car1, 50);
        passengers.add(pass);
        Passenger pass2=new Non_sub_pass("Manal","2",car2,60,false);
        passengers.add(pass2); // Non-subscriber with discount coupon
try {
    pass.reserveCar(car1);
   pass.display();
    System.out.println("________________________________");


}catch (Exception e ){
            System.out.println(e.getMessage());
        }
try {
pass2.reserveCar(car2);
pass2.display();
}catch (Exception e){
    System.out.println(e.getMessage());
}


//        // Display passengers' information
//        for (Passenger passenger : passengers) {
//            passenger.display();
//            System.out.println("_______________________");
//
//        }

        }

    }
