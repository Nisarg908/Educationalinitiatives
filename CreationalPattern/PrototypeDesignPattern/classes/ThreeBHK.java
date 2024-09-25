package classes;

public class ThreeBHK extends House{
    int furnitureCharges;
    ThreeBHK(){
        house_id = 3;
        house_area = 1100;
        house_No = count++;
        price = 12000000;
        furnitureCharges = 20000;
        owner = new Owner("Ram", new ContactDetails(909, "ram@gmail.com"));
    }
}
