package task048_Automat.services;

import task048_Automat.models.Automat;
import task048_Automat.models.AbstractProduct;

public class BestProductService {
    public void getBestProduct(Automat automat) {
        AbstractProduct bestProduct = automat.GetProductById(0);

        for (var el : automat.getProductsList().entrySet()) {
            if (bestProduct == null) {
                bestProduct = el.getKey();
            } else {
                if (el.getKey().compareTo(bestProduct) == -1) {
                    bestProduct = el.getKey();
                }
            }
        }

        System.out.println("Лучший товар в торговом автомате - " + bestProduct);
    }
}
