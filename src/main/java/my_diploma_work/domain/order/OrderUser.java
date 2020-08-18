package my_diploma_work.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private OrderToy orderToy;
    private OrderStatus status;
    private String address;
    private String telephone;
    private DeliveryMethod deliveryMethod;
    private PaymentMethod paymentMethod;
    @OneToOne
    private Store store;
}
