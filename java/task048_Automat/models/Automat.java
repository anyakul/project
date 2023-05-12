package task048_Automat.models;

public class Automat extends AbstractProductSet {
    protected Integer size;
    protected static int defaultIndex = 1;
    protected String name;

    public Automat(String name, Integer size) {
        this.id = defaultIndex++;
        this.name = name;
        this.size = size;
    }

    public final boolean AddProduct(AbstractProduct product, int num) {
        if (productsList.size() < size && num != 0) {
            productsList.put(product, num);
            return true;
        } else {
            return false;
        }
    }

    public final AbstractProduct GetProductById(int id) {
        for (var product : productsList.entrySet()) {
            if (product.getKey().getId() == id) {
                return product.getKey();
            }
        }

        return null;
    }

    public AbstractProduct GetProduct(String name) {
        for (var p : productsList.entrySet()) {
            if (p.getKey().getName().equals(name)) {
                return p.getKey();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
