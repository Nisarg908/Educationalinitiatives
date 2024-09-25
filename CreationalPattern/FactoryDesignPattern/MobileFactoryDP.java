import java.util.Scanner;
import classes.*;

public class MobileFactoryDP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileFactory mf = new MobileFactory();
        System.out.println("Which mobile you'd like to buy: ");
        String s = sc.next();
        Mobile m1 = mf.creatMobile(s);
        System.out.println(m1.getUI());
        System.out.println(m1.unlockMobile());
        System.out.println(m1.charging());
    }
}