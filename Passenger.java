public class Passenger {
    int id;
    Address address;
    Contact contact;
    public Address getAddress() {
        return address;
    }
    public Contact getContact() {
        return contact;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
