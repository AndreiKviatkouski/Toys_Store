package my_diploma_work.repository;

import my_diploma_work.domain.order.OrderToy;
import my_diploma_work.domain.order.OrderUser;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Sort.Order,Long> {
    OrderUser getByIdUser(long id);

    OrderToy getByIdToy(long id);

    List<OrderUser> getAllOrderByUser();

    List<OrderToy> getAllOrderByToy();

    OrderUser updateByIdUser(long id);

    OrderToy updateByIdToy(long id);

    void remove(OrderToy orderToy);

    void remove(OrderUser orderUser);

    void removeOrderByUser(long id);

    void  removeOrderByToy(long id);

}
