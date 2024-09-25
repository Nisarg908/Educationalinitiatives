package classes;

import java.util.*;
import java.io.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class CustomerServiceProxy implements CustormerServiceDatabase{ //we give this to clients
    CustomerService cs = new CustomerService();
    @Override
    public Customer getCustoemerDetails(String custID) throws Exception{
        //Write activity or log
        //i.e. write user info to the logCustomerDatabase.txt->custID, Time, role
        //This is known as Logging Proxy
        //if user role is "Admin" then forward the request
        //else message "ACCESS IS DENIED"
        //This is known as Protection Proxy
        FileOutputStream write = new FileOutputStream("userlog.csv",true);
        OutputStreamWriter output = new OutputStreamWriter(write);
        BufferedWriter writer = new BufferedWriter(output);
        
        FileReader fr = new FileReader("userinfo.csv");
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();

        Scanner sc = new Scanner(System.in);
        // String arr[] = new String[4];
        Customer c = null;
        System.out.print("UserId: ");
        String uid = sc.nextLine();
        
        System.out.print("Password: ");
        String pass = sc.nextLine();

        String logentry[] =new String[3];
        logentry[0] = uid;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        logentry[1] = dtf.format(now);  
        int counter =0;
        while ((line = reader.readLine()) != null){
            String words[] = line.strip().split(",");
            //System.out.println(Arrays.toString(words));
            if(uid.equals(words[0]) && pass.equals(words[2])){
                logentry[2] = words[3];
                writer.newLine();
                writer.write(logentry[0]+","+logentry[1]+","+logentry[2]);
                writer.close();
                if(words[3].equalsIgnoreCase("Admin")){
                    c = cs.getCustoemerDetails(custID);
                    return c;
                }
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("INVALID UserID and Password");
            return c;
        }
        System.out.println("ACCESS IS DENIED");
        return c;
    }
    
}