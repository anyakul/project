package task048_Automat.models;

import java.util.HashMap;

public abstract class AbstractProductSet {
    protected Integer id;
    protected Integer size;
    protected HashMap<AbstractProduct, Integer> productsList = new HashMap<>();

    public abstract boolean AddProduct(AbstractProduct product, int num);

    public Integer getId() {
        return id;
    }

    public final Integer getSize() {
        return size;
    }

    public final HashMap<AbstractProduct, Integer> getProductsList() {
        return productsList;
    }

    public final void setSize(Integer size) {
        this.size = size;
    }
}
