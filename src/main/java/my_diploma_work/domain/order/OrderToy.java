package my_diploma_work.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my_diploma_work.domain.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderToy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private List<ToyInOrder> toyInOrder;
    private User user;
}
