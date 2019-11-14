package servlets.FlightSearch;


public class FlightSearch {
    private String flightDate;
    private int price;
    private String flightFrom;
    private String flightTo;
    private int duration;
    private int bookedSeat;
    private  int totalSeat;

    public FlightSearch(String flightDate, int price, String flightFrom, String flightTo, int duration, int bookedSeat, int totalSeat) {
        this.flightDate = flightDate;
        this.price = price;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.duration = duration;
        this.bookedSeat = bookedSeat;
        this.totalSeat = totalSeat;
    }

    public FlightSearch(){

    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

}
