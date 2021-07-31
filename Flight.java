public class Flight {
    private int flightNumber;
    private String airLine;
    private int flightCap = 100;
    private int seat;

    seat = flightCap;
    
    public String getAirLine() {
        return airLine;
    }
    public int getFlightCap() {
        return flightCap;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public int getNoOfSeats() {
        return seat;
    }
    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }
    public void setFlightCap(int flightCap) {
        this.flightCap = flightCap;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.seat = noOfSeats;
    }
    int Flight()
    {
        return seat --;
    }

}
