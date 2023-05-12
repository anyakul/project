package task048_Automat.repository.interfaces;

import task048_Automat.models.Order;

public interface OrderRepositoryInterface {
    public Order GetOrderByCode(Integer code);
}
