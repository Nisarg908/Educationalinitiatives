package classes;

import java.util.*;

public class AuctionerMediator implements MediatorEntity {

    List<CollegueEntity_Bidder> ls = new ArrayList<>();

    @Override
    public void registerBidder(CollegueEntity_Bidder bd) {
        ls.add(bd);
    }

    @Override
    public void searchHighestBidAmount() {
        int maxBid = 0;
        CollegueEntity_Bidder b = null;
        for(CollegueEntity_Bidder cb : ls) {
            if(cb.getBidPrice() > maxBid) {
                maxBid = cb.getBidPrice();
                b = cb;
            }
        }
        System.out.println("Winner of the auctioning is: " + b);
    }
}
