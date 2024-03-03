public class Sub_pass extends Passenger{

    public Sub_pass(String name, String id, Car reserved_car, double trip_Cost) {
        super(name, id, reserved_car, trip_Cost);
    }

    @Override
    public double computeTrip_cost() {
        return getReserved_car().getFix_route().getTrip_price() * 0.5; // 50% discount
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapcity()== 0) {
            throw new Exception("Cannot reserve car.");
        }
        this.reserved_car= car;
        computeTrip_cost();
        car.setMaxCapcity(car.getMaxCapcity() - 1);
    }

    @Override
    public void display() {
        System.out.println("The subscribe passengers\n"+"the name :"+getName()+
                "\nthe Id : "+getId()+"\nCar reserved : "+ getReserved_car().getCode() +
                "\nthe trip cost : "+computeTrip_cost());


     }


}
