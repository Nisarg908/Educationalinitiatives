package classes;

public class House implements Cloneable{
    protected int house_id;
    protected double house_area;
    protected double price;
    static int count=1;
    protected int house_No;
    protected Owner owner;

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    public int getHouse_id() {
        return house_id;
    }
    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }
    public double getHouse_area() {
        return house_area;
    }
    public void setHouse_area(double house_area) {
        this.house_area = house_area;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    @Override
    public String toString() {
        return "\nHouse Details: "+"\nHouse ID: "+house_id+"\nHouse No.: "+house_No+"\nHouse Area: "+house_area+"\nHouse Price: "+price+owner;
    }
}