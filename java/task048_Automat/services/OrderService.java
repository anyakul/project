package task048_Automat.services;

import task048_Automat.models.Order;
import task048_Automat.repository.OrderRepository;
import task048_Automat.view.OrderView;

public class OrderService implements ServiceInterface<Order, OrderRepository> {
    private OrderRepository repository = new OrderRepository();

    public OrderService() {
        this.repository = new OrderRepository();
    }

    public void AddInRepository(Order productsSet) {
        if (!productsSet.getProductsList().isEmpty()) {
            repository.AddProductSet(productsSet);
        } else {
            System.out.println("Заказ пустой");
        }
    }

    public Order GetById(int num) {
        Order productSet = repository.GetProductSetById(num);
        if (productSet != null) {
            return productSet;
        } else {
            System.out.println("Заказ не найден");
            return null;
        }
    }

    public void GetProductSets() {
        if (repository.getList().isEmpty()) {
            OrderView orderView = new OrderView(true, "Репозиторий заказов пустой. Создайте новый заказ");
            orderView.PrintSetList(null);
        }
        OrderView orderView = new OrderView(false, null);
        orderView.PrintSetList(repository.getList());
    }

    public void GetProductList(Order productSet) {
        if (productSet.getProductsList().isEmpty()) {
            OrderView orderView = new OrderView(true, "В заказе нет товаров. Добавьте");
            orderView.PrintProductList(null);
        }

        OrderView orderView = new OrderView(false, null);
        orderView.PrintProductList(productSet.getProductsList());
    }

    public void GetOrderByCode(Integer code) {
        if (repository.GetOrderByCode(code) == null) {
            OrderView orderView = new OrderView(true, "Такой заказ не найден. Введите другой код");
            orderView.PrintProductList(null);
        }

        OrderView orderView = new OrderView(false, null);
        orderView.PrintProductList(repository.GetOrderByCode(code).getProductsList());
    }

    public OrderRepository getRepository() {
        return repository;
    }
}
