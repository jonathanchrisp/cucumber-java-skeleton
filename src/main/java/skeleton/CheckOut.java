package skeleton;

/**
 * Created by jonathan on 04/04/2014.
 */
public class CheckOut {

    private int quantityOfEspresso;
    private int priceOfEspresso;

    public void setPriceOfEspresso(int price) {
        this.priceOfEspresso = price;
    }

    public void setQuantityOfEspresso(int quanity) {
        this.quantityOfEspresso = quanity;
    }

    public int getTotal() {
        return this.priceOfEspresso * this.quantityOfEspresso;
    }
}
