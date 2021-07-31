public class Flight {
    int flightNumber;
    String airLine;
    int flightCap;
    int seat;

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
    int availableSeat(int book)
    {
        return seat - book;
    }

}
