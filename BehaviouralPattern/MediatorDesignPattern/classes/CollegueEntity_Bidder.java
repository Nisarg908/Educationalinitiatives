package classes;

public abstract class CollegueEntity_Bidder {
    protected MediatorEntity md;
    protected String bName;
    protected int bPrice;

    public CollegueEntity_Bidder(MediatorEntity md, String bName) {
        this.md = md;
        this.bName = bName;
    }

    public int getBidPrice() {
        return bPrice;
    }

    @Override
    public String toString() {
        return "Bidder name: " + bName + " giving bidAmount: " + bPrice;
    }

    public abstract void bidAmount(int amount);
}
