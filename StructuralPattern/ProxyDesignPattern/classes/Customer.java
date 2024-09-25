package classes;

public class Customer{
    String custID, custName, custEmail, custCity;
    Customer(String custID, String custName, String custEmail, String custCity){
        this.custID = custID;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custCity = custCity;
    }
    @Override
    public String toString() {
        return "CustID: "+custID+"\tCustomerName: "+custName+"\tCustomerEmail: "+custEmail+"\tCustomerCity: "+custCity;
    }
}