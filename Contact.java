public class Contact extends Address {
    private String name;
    private String number;
    private String email;
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
