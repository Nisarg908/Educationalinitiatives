package classes;

public class MobileFactory {
    public Mobile creatMobile(String m){
        switch(m.toLowerCase()){
            case("samsung"):
                return new Samsung();
            case("iphone"):
                return new Iphone();
            default:
                return null;
        }
        //return null;
    }
}