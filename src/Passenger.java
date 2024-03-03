public abstract class Passenger {
    private String name;
    private String id;
    Car reserved_car;
    private double trip_Cost;


    public Passenger(String name, String id,Car reserved_car,double trip_Cost) {
        this.name=name;
        this.id=id;
        this.reserved_car=reserved_car;
        this.trip_Cost=trip_Cost;
    }

    public Passenger() {

    }

    public abstract void display();
    public abstract double computeTrip_cost();

    public Car getReserved_car() {
        return reserved_car;
    }
    public double getTrip_Cost() {
        return trip_Cost;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }

    public void setTrip_Cost(double trip_Cost) {
        this.trip_Cost = trip_Cost;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void reserveCar(Car car)throws Exception {

            this.reserved_car= car;
        }

    }

