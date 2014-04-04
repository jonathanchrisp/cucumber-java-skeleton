package skeleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jonathan on 04/04/2014.
 */
public class CheckOut {

    private final Map<String,Integer> productPrices = new HashMap<String,Integer>();
    private int total = 0;

    public void setPriceOfEspresso(int priceOfEspresso) {
        productPrices.put("espresso", priceOfEspresso);
    }

    public void setPriceOfCroissant(int priceOfCroissant) {
        productPrices.put("croissant", priceOfCroissant);
    }

    public void setQuantityOfEspresso(int quanityOfEspresso) {
        this.total += quanityOfEspresso * productPrices.get("espresso");
    }

    public void setQuantityOfCroissant(int quanityOfCroissant) {
        this.total += quanityOfCroissant * productPrices.get("croissant");
    }

    public int getTotal() {
        return this.total;
    }
}
