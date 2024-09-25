package classes;

public class Bidder extends CollegueEntity_Bidder {

    public Bidder(MediatorEntity md, String bName) {
        super(md, bName);
    }

    @Override
    public void bidAmount(int amount) {
        bPrice = amount;
    }
}
