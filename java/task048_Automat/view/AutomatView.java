package task048_Automat.view;

import java.util.ArrayList;
import java.util.HashMap;

import task048_Automat.models.Automat;
import task048_Automat.models.AbstractProduct;

public class AutomatView extends AbstractView<Automat> {
    public AutomatView(boolean error, String errorMessage) {
        super(error, errorMessage);
    }

    public void PrintSetList(ArrayList<Automat> productSets) {
        System.out.println("Список торговых автоматов:\n");
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (Automat el : productSets) {
                res.append(el.getId() + " " + el.getName() + "\n");
            }
        }

        System.out.println(res);
    }

    public void PrintProductList(HashMap<AbstractProduct, Integer> productList) {
        System.out.println("Спасок товаров в торговом автомате:\n");
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (var el : productList.entrySet()) {
                res.append(el.getKey() + "\n");
            }
        }

        System.out.println(res);
    }
}
