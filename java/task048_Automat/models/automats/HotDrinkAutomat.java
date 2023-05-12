package task048_Automat.models.automats;

import task048_Automat.models.Automat;
import task048_Automat.models.AbstractProduct;
import task048_Automat.models.products.HotDrink;

public class HotDrinkAutomat extends Automat {
    public HotDrinkAutomat(String name, Integer size) {
        super(name, size);
    }

    public AbstractProduct GetProduct(String name, Double valume, int temperature) {
        for (var p : productsList.entrySet()) {
            if (p instanceof HotDrink && p.getKey().getName().equals(name)
                    && ((HotDrink) p.getKey()).getValume() == valume
                    && ((HotDrink) p.getKey()).getTemperature() == temperature) {
                return p.getKey();
            }
        }

        return null;
    }
}
