public class Tickets {

    int pnr;
    String destinationLocation;
    int seatNo;
    String depDnT;
    String arrDnT;
    int Bookqty;
    int fair;
    boolean confirmation;
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