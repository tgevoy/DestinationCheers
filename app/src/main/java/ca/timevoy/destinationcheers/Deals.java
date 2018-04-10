package ca.timevoy.destinationcheers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is the blueprint for creating Deal items.
 */

class Deals {

    /**
     * A deal item representing a happy hour deal.
     */
    class DealItem {

        String day;
        String dealOfDay;
        String establishment;
        String location;
        String availability;
        String details;
        String website;

        /**
         * Deal item constructor to initialize properties.
         */
        DealItem(String day, String dealOfDay, String establishment,
                 String location, String availability, String details, String website) {

            this.day = day;
            this.dealOfDay = dealOfDay;
            this.establishment = establishment;
            this.location = location;
            this.availability = availability;
            this.details = details;
            this.website = website;
        }

        // GETTER for day
        String getDay() {
            return day;
        }

        // GETTER for deal of the day
        String getDealOfDay() {
            return dealOfDay;
        }

        // GETTER for establishment
        String getEstablishment() {
            return establishment;
        }

        // GETTER for location
        String getLocation() {
            return location;
        }

        // GETTER for availability
        String getAvailability() {
            return availability;
        }

        // GETTER for details
        String getDetails() {
            return details;
        }

        // GETTER for website
        String getWebsite() { return website; }

    }

    // An array of sample deal items.
    static final List<DealItem> ITEMS = new ArrayList<>();

    // A map of sample deal items, by ID.
    static final Map<String, DealItem> ITEM_MAP = new HashMap<String, DealItem>();

    // Add deal item and its ID.
    private static void addDealItem(DealItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.day, item);
    }

    // Create deal item's content to display.
    void createDealItems() {
        addDealItem(new DealItem("Monday", "Mango Cheesecake & Mojitos", "Case Of The Mondays", "100 Warf Street", "3pm to 6pm", "Scrumptious Mango Cheescake that melts in your mouth $5/slice.\n\nRefreshingly delicious Mojitos (choice of Mint, Raspberry, or Blueberry) $5 for 2oz.", "www.caseofthemondays.com"));
        addDealItem(new DealItem("Tuesday", "Tuna Tataki & Gin + Tonics", "Tommy's Bistro", "200 Duglas Street", "3pm to 6pm", "Fresh from the Pacific ocean and locally caught Tuna Tataki $12 for half-size, $16 for full-size.\n\nTraditionally delicious and always fitting Gin + Tonics to enjoy $6 for 2oz.", "www.tommysbistro.com"));
        addDealItem(new DealItem("Wednesday", "Hot Wings & Whiskey Sours", "Just Wing'n It!", "300 Foul Bay Boulevard", "3pm to 6pm", "Tempt your tastebuds and tolerance levels with our house-made Hot Wings $6/pound.\n\nDo you feel the burn from the wings? Cool your tastebuds with a classic Whiskey Sour cocktail $5 for 1.5oz.", "www.justwingnit.com"));
        addDealItem(new DealItem("Thursday", "Tandoori Chicken & Tiki Masala", "India's Finest", "400 Quadrah Corner", "3pm to 6pm / 9pm to 11pm", "Ever wanted to travel to India but couldn't? No problem, let India's fine cuisine come to you, with sintillizing Tandoori Chicken and Tiki Masala dishes for $12 each.", "www.indiasfinest.com"));
        addDealItem(new DealItem("Friday", "Featured Pints & Filet Mignon", "TGI..Friyays!", "500 Vancuver Road", "4pm to 6pm / 8pm to 10pm", "Unwind from the hectic workweek with one of our locally-sourced Featured Pints on tap $5.50.\n\nCraving something tender and juicy? Try our award-winning Filet Mignon $23 for 9oz.", "www.tgifriyays.com"));
        addDealItem(new DealItem("Saturday", "Shucked Oysters & Soup du Jour", "Nautical Nancys", "600 Cooke Avenue", "11am to 1pm / 3pm to 5pm", "Roll your sleeves up and start shucking! Our oysters are freshly caught from the Pacific ocean $1/shuck.\n\nTry our city-famous Soup du Jour, perfect for any time of day and weather $6 for bowl, $4 for cup.", "www.nauticalnancys.com"));
        addDealItem(new DealItem("Sunday", "Seafood Caesars & Soup du Jour", "Stormy Waters", "700 Oak Crescent", "11am to 1pm / 5pm to 7pm", "Enjoy one of our robust Seafood Caesars $7 for 2oz.\n\nOur Select Appies are perfect for a quick Sunday bite $6.50 (ask your server).", "www.stormywaters.com"));
    }
}

