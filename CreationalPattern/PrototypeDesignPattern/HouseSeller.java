import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import classes.*;

public class HouseSeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SampleHouse sh = new SampleHouse();
        House twoBHK1 = sh.getHouse(2);
        House twoBHK2 = sh.getHouse(2);
        House threeBHK1 = sh.getHouse(3);
        System.out.println(twoBHK1);
        System.out.println(twoBHK2);
        System.out.println(threeBHK1);
        
        twoBHK2.getOwner().setName("Nisarg");;
        System.out.println(twoBHK1);
        System.out.println(twoBHK2);
        System.out.println(threeBHK1);
        
    }
}
