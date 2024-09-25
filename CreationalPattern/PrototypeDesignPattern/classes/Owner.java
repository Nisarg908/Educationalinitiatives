package classes;

public class Owner{
    protected String Name;
    private ContactDetails Contact;
    Owner(String name, ContactDetails contact){
        Name = name;
        Contact = contact;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public ContactDetails getContact() {
        return Contact;
    }
    public void setContact(ContactDetails contact) {
        Contact = contact;
    }
    @Override
    public String toString() {
        return "\nName: "+Name+"\nContact Details: "+Contact;
    }
}