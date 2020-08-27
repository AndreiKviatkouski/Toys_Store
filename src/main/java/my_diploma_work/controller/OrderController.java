package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.repository.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Data
@RestController
@RequestMapping(path = "/order")
public class OrderController {
    private final OrderRepository orderRepository;
    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("order");
        return modelAndView;
    }

}
