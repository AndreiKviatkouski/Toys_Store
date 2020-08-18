package my_diploma_work.controller;


import lombok.Data;
import my_diploma_work.repository.AdminRepository;
import my_diploma_work.repository.OrderRepository;
import my_diploma_work.repository.ToyRepository;
import my_diploma_work.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping(path = "/administrator")
public class AdminController {
    private final AdminRepository adminRepository;
    private final UserRepository userRepository;
    private final ToyRepository toyRepository;
    private final OrderRepository orderRepository;


}
