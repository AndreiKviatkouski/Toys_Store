package my_diploma_work.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private OrderToy orderToy;
    private OrderStatus status;
    private String address;
    private String telephone;
    private DeliveryMethod deliveryMethod;
    private PaymentMethod paymentMethod;
    private Store store;
}
