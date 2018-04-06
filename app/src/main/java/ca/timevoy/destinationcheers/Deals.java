package ca.timevoy.destinationcheers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tim Evoy on 2018-04-04.
 */

public class Deals {

    /**
     * A deal item representing a happy hour deal.
     */
    public class DealItem {
        //public String id;
        public String day;
        public String dealOfDay;
        public String establishment;
        public String location;
        public String availability;
        public String details;
        public String website;

        /**
         * Deal item constructor to initialize properties.
         */
        public DealItem(String day, String dealOfDay, String establishment,
                        String location, String availability, String details, String website) {
            //this.id = id;
            this.day = day;
            this.dealOfDay = dealOfDay;
            this.establishment = establishment;
            this.location = location;
            this.availability = availability;
            this.details = details;
            this.website = website;
        }

        // GETTER for day
        public String getDay() {
            return day;
        }

        // GETTER for deal of the day
        public String getDealOfDay() {
            return dealOfDay;
        }

        // GETTER for establishment
        public String getEstablishment() {
            return establishment;
        }

        // GETTER for location
        public String getLocation() {
            return location;
        }

        // GETTER for availability
        public String getAvailability() {
            return availability;
        }

        // GETTER for details
        public String getDetails() {
            return details;
        }

        // GETTER for website
        public String getWebsite() { return website; }

    } // End of DealItem class

    // An array of sample deal items.
    public static final List<DealItem> ITEMS = new ArrayList<>();

    // A map of sample deal items, by ID.
    public static final Map<String, DealItem> ITEM_MAP = new HashMap<String, DealItem>();

    // Add deal item and its ID.
    private static void addDealItem(DealItem deal) {
        ITEMS.add(deal);
        ITEM_MAP.put(deal.day, deal);
    }

    // Create deal item's content to display.
    public void createDealItems() {
        addDealItem(new DealItem("Monday", "Mango Cheesecake & Mojitos", "Case Of The Mondays", "100 Warf Street, Victoria, B.C.", "3pm to 6pm", "\nScrumptious Mango Cheescake that melts in your mouth $5/slice.\n\nRefreshingly delicious Mojitos (choice of Mint, Raspberry, or Blueberry) $5 for 2oz.", "www.caseofthemondays.com"));
        addDealItem(new DealItem("Tuesday", "Tuna Tataki & Gin + Tonics", "Tommy's Bistro", "200 Duglas Street, Victoria, B.C.", "3pm to 6pm", "\nFresh from the Pacific ocean and locally caught Tuna Tataki $12 for half-size, $16 for full-size.\n\nTraditionally delicious and always fitting Gin + Tonics to enjoy $6 for 2oz.", "www.tommysbistro.com"));
        addDealItem(new DealItem("Wednesday", "Hot Wings & Whiskey Sours", "Just Wing'n It!", "300 Blandsherd Boulevard, Victoria, B.C.", "3pm to 6pm", "\nTempt your tastebuds and tolerance levels with our house-made Hot Wings $6/pound.\n\nDo you feel the burn from the wings? Cool your tastebuds with a classic Whiskey Sour cocktail $5 for 1.5oz.", "www.justwingnit.com"));
        addDealItem(new DealItem("Thursday", "Tandoori Chicken & Tiki Masala", "India's Finest", "400 Quadrah Corner, Victoria, B.C.", "3pm to 6pm and 9pm to 11pm", "\nEver wanted to travel to India but couldn't? No problem, let India's fine cuisine come to you, with sintillizing Tandoori Chicken and Tiki Masala dishes for $12 each.", "www.indiasfinest.com"));
        addDealItem(new DealItem("Friday", "Featured Pints & Filet Mignon", "TGI..Friyays!", "500 Vancuver Road, Victoria, B.C.", "4pm to 6pm and 8pm to 10pm", "\nUnwind from the hectic workweek with one of our locally-sourced Featured Pints on tap $5.50.\n\nCraving something tender and juicy? Try our award-winning Filet Mignon $23 for 9oz.", "www.tgifriyays.com"));
        addDealItem(new DealItem("Saturday", "Shucked Oysters & Soup du Jour", "Nautical Nancys", "600 Cooke Avenue, Victoria, B.C.", "11am to 1pm and 3pm to 5pm", "\nRoll your sleeves up and start shucking! Our oysters are freshly caught from the Pacific ocean $1/shuck.\n\nTry our city-famous Soup du Jour, perfect for any time of day and weather $6 for bowl, $4 for cup.", "www.nauticalnancys.com"));
        addDealItem(new DealItem("Sunday", "Seafood Caesars & Soup du Jour", "Stormy Waters", "700 Oak Crescent, Victoria, B.C.", "11am to 1pm and 5pm to 7pm", "\nEnjoy one of our robust Seafood Caesars $7 for 2oz.\n\nOur Select Appies are perfect for a quick Sunday bite $6.50 (ask your server).", "www.stormywaters.com"));
    }

} // End of Deals class






// OLD DUMMY CLASS FOR REFERENCE
//package ca.timevoy.destinationcheers.dummy;
//
//        import java.util.ArrayList;
//        import java.util.HashMap;
//        import java.util.List;
//        import java.util.Map;
//
///**
// * Helper class for providing sample content for user interfaces created by
// * Android template wizards.
// * <p>
// * TODO: Replace all uses of this class before publishing your app.
// */
//public class DummyContent {
//
//    /**
//     * An array of sample (dummy) items.
//     */
//    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
//
//    /**
//     * A map of sample (dummy) items, by ID.
//     */
//    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
//
//    private static final int COUNT = 25;
//
//    static {
//        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }
//    }
//
//    private static void addItem(DummyItem item) {
//        ITEMS.add(item);
//        ITEM_MAP.put(item.id, item);
//    }
//
//    private static DummyItem createDummyItem(int position) {
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
//    }
//
//    private static String makeDetails(int position) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Details about Item: ").append(position);
//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
//        return builder.toString();
//    }
//
//    /**
//     * A dummy item representing a piece of content.
//     */
//    public static class DummyItem {
//        public final String id;
//        public final String content;
//        public final String details;
//
//        public DummyItem(String id, String content, String details) {
//            this.id = id;
//            this.content = content;
//            this.details = details;
//        }
//
//        @Override
//        public String toString() {
//            return content;
//        }
//    }
//}

