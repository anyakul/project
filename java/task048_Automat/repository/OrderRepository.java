package task048_Automat.repository;

import task048_Automat.models.Order;
import task048_Automat.repository.interfaces.OrderRepositoryInterface;

public class OrderRepository extends AbstractRepository<Order> implements OrderRepositoryInterface {
    public Order GetOrderByCode(Integer code) {
        for (Order order : list) {
            if (order.getCode() == code) {
                return order;
            }
        }

        return null;
    }
}
