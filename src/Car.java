public class Car {
    private String code;
    private Route fix_route;
    private int maxCapcity;

    public Car(String code, Route fix_route, int maxCapcity) {
        this.code = code;
        this.fix_route = fix_route;
        this.maxCapcity = maxCapcity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFix_route() {
        return fix_route;
    }

    public void setFix_route(Route fix_route) {
        this.fix_route = fix_route;
    }

    public int getMaxCapcity() {
        return maxCapcity;
    }

    public void setMaxCapcity(int maxCapcity) {
        this.maxCapcity = maxCapcity;
    }
}
