package task048_Automat.controllers;

import task048_Automat.models.Automat;
import task048_Automat.models.Order;
import task048_Automat.models.AbstractProduct;
import task048_Automat.services.OrderService;

public class OrderController {
    private Automat automat;
    private OrderService orderService;

    public OrderController(Automat automat) {
        this.orderService = new OrderService();
        this.automat = automat;
    }

    public void DoOrder() {
        Order order = new Order(automat);
        int[] productNums = new int[] { 5, 3, 3, 2, 6, 4, 4, 3, 7, 8, 9, 1, 1, 1, 1, 8, 7, 2, 5 };

        for (int num : productNums) {
            AbstractProduct productThing = automat.GetProductById(num);

            if (productThing == null) {
                System.out.println("Такого продукта в торговом автомате нет. Выберите другой продукт.");
            } else {
                if (order.getProductsList().containsKey(productThing)) {
                    if (order.AddProduct(productThing, order.getProductsList().get(productThing) + 1)) {
                        System.out.println("Продукт успешно добавлен в заказ.");
                    } else {
                        System.out.println("Вы взяли максимальное количество этого товара. Выберите другой продукт");
                    }
                } else {
                    order.AddProduct(productThing, 1);
                    System.out.println("Продукт успешно добавлен в заказ.");
                }
            }
        }

        orderService.AddInRepository(order);
        orderService.GetProductSets();
        Integer code = 2;
        orderService.GetOrderByCode(code);
    }

    public OrderService getOrderService() {
        return orderService;
    }
}
