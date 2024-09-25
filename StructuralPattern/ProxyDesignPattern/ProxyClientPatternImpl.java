import java.util.*;
import java.io.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import classes.*;

// class ClientProxyPattern{

// }
public class ProxyClientPatternImpl {
    public static void main(String[] args) throws Exception{
        CustomerServiceProxy cs = new CustomerServiceProxy();
        Customer c1 = cs.getCustoemerDetails("CUS101");
        System.out.println(c1);
    }
}
