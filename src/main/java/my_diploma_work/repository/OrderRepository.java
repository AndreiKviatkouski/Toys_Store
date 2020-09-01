package my_diploma_work.repository;

import my_diploma_work.domain.order.OrderToy;
import my_diploma_work.domain.order.OrderUser;
import my_diploma_work.domain.toys.*;
import my_diploma_work.domain.user.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.Order;
import java.math.BigDecimal;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderToy,Long> {
    OrderToy findById(long id);

    List<OrderToy> findAllBy();






//
//    @Query(value = "update Toy set review = ?1 where id = ?2")
//    String updateToyByReview(Review review, long id);

    void deleteOrderToyById(long id);

    boolean existsOrderToyById(long id);


}
