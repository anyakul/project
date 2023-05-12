package task048_Automat.models;

import java.util.HashMap;

public class Order extends AbstractProductSet {
    private final Automat automat;
    private final Integer code;
    protected static int defaultIndex = 1;
    HashMap<AbstractProduct, Integer> pruducts;

    public Order(Automat automat) {
        this.id = defaultIndex++;
        this.code = 2;
        this.automat = automat;
        this.pruducts = automat.getProductsList();
    }

    public boolean AddProduct(AbstractProduct product, int num) {
        if (num < pruducts.get(product)) {
            productsList.put(product, num);
            return true;
        } else {
            return false;
        }
    }

    public final Automat getAutomat() {
        return automat;
    }

    public Integer getCode() {
        return code;
    }
}
