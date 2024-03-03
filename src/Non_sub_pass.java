


public class Non_sub_pass extends Passenger{
    private boolean discount;

    public Non_sub_pass(String name, String id, Car reserved_car, double trip_Cost,boolean discount) {
        super(name, id, reserved_car, trip_Cost);
        this.discount = discount;
    }

    public Non_sub_pass(String bob, String number, boolean b) {
        super();
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

        System.out.println("ths non-subscribe passengers\n"+"the name :"+getName()+"\nthe Id : "+getId()+
                "\nCar reserved : "+getReserved_car().getCode()+"\nthe trip cost : "+ computeTrip_cost());
    }

    @Override
    public double computeTrip_cost() {
            double price = getReserved_car().getFix_route().getTrip_price();
            if (discount) {
                return price - (price * 0.1); // 10% discount with coupon
            } else {
                return price; // No discount
            }
        }
    }


