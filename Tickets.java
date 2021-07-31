public class Tickets extends Flight {

    private int pnr;
    private String destinationLocation;
    private int seatNo;
    private String depDnT;
    private String arrDnT;
    private int Bookqty;
    private int fair;
    private boolean confirmation;
public String getArrDnT() {
    return arrDnT;
}
public int getBookqty() {
    return Bookqty;
}public String getDepDnT() {
    return depDnT;
}
public String getDestinationLocation() {
    return destinationLocation;
}
public int getFair() {
    return fair;
}
public int getPnr() {
    return pnr;
}
public int getSeatNo() {
    return seatNo;
}
public void setArrDnT(String arrDnT) {
    this.arrDnT = arrDnT;
}public void setBookqty(int bookqty) {
    Bookqty = bookqty;
}
public void setConfirmation(boolean confirmation) {
    this.confirmation = confirmation;
}
public void setDepDnT(String depDnT) {
    this.depDnT = depDnT;
}
public void setDestinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
}
public void setFair(int fair) {
    this.fair = fair;
}
public void setPnr(int pnr) {
    this.pnr = pnr;
}
public void setSeatNo(int seatNo) {
    this.seatNo = seatNo;
}




}