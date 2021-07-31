public class RegularTicket extends Flight {
    private String food;
    private boolean water;
    private String snacks;
    private Passenger passenger;
    public String getFood() {
        return food;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public String getSnacks() {
        return snacks;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
    public void setWater(boolean water) {
        this.water = water;
    }
    

    
}
