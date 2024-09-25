package classes;

public class TwoBHK extends House{
    int parkingCharges;
    TwoBHK(){
        house_id = 2;
        house_area = 700;
        house_No = count++;
        price = 7000000;
        parkingCharges = 1500;
        owner = new Owner("Ram", new ContactDetails(909, "ram@gmail.com"));
    }
}