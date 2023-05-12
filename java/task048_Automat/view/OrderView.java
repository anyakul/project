package task048_Automat.view;

import java.util.ArrayList;
import java.util.HashMap;

import task048_Automat.models.Order;
import task048_Automat.models.AbstractProduct;

public class OrderView extends AbstractView<Order> {
    public OrderView(boolean error, String errorMessage) {
        super(error, errorMessage);
    }

    public void PrintSetList(ArrayList<Order> productSets) {
        System.out.println("Список заказов:\n");
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (Order el : productSets) {
                res.append(el.getId() + " " + el.getCode() + "\n");
            }
        }

        System.out.println(res);
    }

    public void PrintProductList(HashMap<AbstractProduct, Integer> productList) {
        System.out.println("Список товаров в заказе:\n");
        StringBuilder res = new StringBuilder();

        if (error) {
            res.append(errorMessage);
        } else {
            for (var el : productList.entrySet()) {
                res.append(el.getKey().getName() + " " + el.getKey().getPrice() + "Р. " + el.getValue() + "шт.\n");
            }
        }

        System.out.println(res);
    }
}
