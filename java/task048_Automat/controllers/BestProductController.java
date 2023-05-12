package task048_Automat.controllers;

import task048_Automat.models.Automat;
import task048_Automat.models.AbstractProduct;
import task048_Automat.services.BestProductService;

public class BestProductController {
    private Automat automat;
    private BestProductService bestProductService;

    public BestProductController(Automat automat) {
        this.automat = automat;
        this.bestProductService = new BestProductService();
    }

    public void CompareTwoProducts(AbstractProduct product1, AbstractProduct product2) {
        if (product1.compareTo(product2) == 1) {
            System.out.println(product1 + " привлекательнее чем " + product2);
        }

        System.out.println(product2.getName() + " привлекательнее чем " +
                product1.getName());
    }

    public void GetBestProductInAutomat() {
        bestProductService.getBestProduct(automat);
    }
}
