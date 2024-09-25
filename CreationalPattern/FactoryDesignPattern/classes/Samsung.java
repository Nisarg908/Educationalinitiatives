package classes;

public class Samsung implements Mobile{
    @Override
    public String getUI() {
        return "One UI";
    }
    @Override
    public String unlockMobile() {
        return "Welcome to Samsung Galaxy";
    }
    @Override
    public String charging() {
        return "Samsung is fast charing";
    }
}