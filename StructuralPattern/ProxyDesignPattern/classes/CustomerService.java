package classes;

import java.io.*;

public class CustomerService implements CustormerServiceDatabase{  //client wants to access this
    @Override
    public Customer getCustoemerDetails(String custID) throws Exception {
        //Read the file customerinfo.txt
        //Search for thr custID if exist return Customer Details.
        //Else record not found
        //File file = new File("C:/Users/Nisarg/Nisarg/Nisarg1/Design Pattern Lab/customerinfo.txt"); 
        FileReader fr = new FileReader("customerinfo.csv");
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        int counter = 0;
        Customer c = null;
        while ((line = reader.readLine()) != null){
            String words[] = line.strip().split(",");
            //System.out.println(Arrays.toString(words));
            if(custID.equals(words[0])){
                //System.out.println(line);
                c = new Customer(words[0],words[1],words[2],words[3]);
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("CustID of customer not found.\n");
        }
        reader.close();
        return c;
    }
}
