package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.repository.OrderRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping(path = "/order")
public class OrderController {
    private final OrderRepository orderRepository;

}
