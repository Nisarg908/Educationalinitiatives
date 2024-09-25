import java.util.*;
import classes.*;
//  Auctioning
//  Bidders-colleagues
//  Mediator-Auctioner

public class MediatorDesignPattern {
    public static void main(String[] args) {
        MediatorEntity m1 = new AuctionerMediator();
        CollegueEntity_Bidder b1 = new Bidder(m1, "Bidder");
        CollegueEntity_Bidder b2 = new Bidder(m1, "Bidder2");
        CollegueEntity_Bidder b3 = new Bidder(m1, "Bidder3");
        // CollegueEntity_Bidder b4 = new Bidder(m1, "Bidder");
        System.out.println("Welcome all Bidder for auctioning event:");

        m1.registerBidder(b1);
        m1.registerBidder(b2);
        m1.registerBidder(b3);

        b1.bidAmount(5000);
        b2.bidAmount(2000);
        b3.bidAmount(6000);
        m1.searchHighestBidAmount();
    }
}
