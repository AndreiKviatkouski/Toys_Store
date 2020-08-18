package my_diploma_work.repository;

import my_diploma_work.domain.order.OrderToy;
import my_diploma_work.domain.order.OrderUser;
import my_diploma_work.domain.toys.Review;
import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ModeratorRepository extends JpaRepository<User, Role> {

    OrderToy checkUser(OrderToy orderToy, long id);

    OrderUser checkUser(OrderUser orderUser, long id);

    String removeReview(Review review, int id);
}
