public class TouristTicket {
    String hotelAddress;
    int turistLocation[] = new int[5];
    Passenger passenger2;
     void removeTuristLocation()
     {
         turistLocation[0] = 0;
         turistLocation[1] = 0;
         turistLocation[2] = 0;
         turistLocation[3] = 0;
         turistLocation[4] = 0;
     }
     public String getHotelAddress() {
         return hotelAddress;
     }
     public int[] getTuristLocation() {
         return turistLocation;
     }
     public void setHotelAddress(String hotelAddress) {
         this.hotelAddress = hotelAddress;
     }
     public void setTuristLocation(int[] turistLocation) {
         this.turistLocation = turistLocation;
     }
}
