package classes;

public class Iphone implements Mobile{
    @Override
    public String getUI() {
        return "IOS";
    }
    @Override
    public String unlockMobile() {
        return "Namaste welcome to Apple";
    }
    @Override
    public String charging() {
        return "Iphone is charging";
    }
}
