package classes;

public class ContactDetails{
    protected long number;
    protected String email;

    ContactDetails(long number,String email){
        this.number = number;
        this.email = email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public long getNumber() {
        return number;
    }
    public String toString() {
        return "\nNumber: "+number+"\tEmail Id: "+email;
    }
}