public class Route{

    private String star_trip;
    private String end_trip;
    private double trip_price;

    public Route(String star_trip, String end_trip, double trip_price) {
        this.star_trip = star_trip;
        this.end_trip = end_trip;
        this.trip_price = trip_price;
    }

    public String getStar_trip() {
        return star_trip;
    }

    public void setStar_trip(String star_trip) {
        this.star_trip = star_trip;
    }

    public String getEnd_trip() {
        return end_trip;
    }

    public void setEnd_trip(String end_trip) {
        this.end_trip = end_trip;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }
}
