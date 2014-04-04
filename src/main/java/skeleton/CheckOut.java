package skeleton;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by jonathan on 04/04/2014.
 */
public class CheckOut {

    public Map<String,Integer> productPrices = new HashMap<String,Integer>();
    private int total = 0;

   public void setProducts(Map<String,Integer> products) {
       this.productPrices = products;
   }

    public void setQuantity(String product, int quantity) {
        total += quantity * productPrices.get(product);
    }

    public int getTotal() {
        return total;
    }
}
