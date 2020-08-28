package my_diploma_work.controller;


import lombok.Data;
import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.AdminRepository;
import my_diploma_work.repository.OrderRepository;
import my_diploma_work.repository.ToyRepository;
import my_diploma_work.repository.UserRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Data
@RestController
@RequestMapping(path = "/admin")
public class AdminController {
    private final AdminRepository adminRepository;
    private final UserRepository userRepository;
    private final ToyRepository toyRepository;
    private final OrderRepository orderRepository;

    @GetMapping("/findByEmail")
    public ModelAndView findUserByEmail(String email, ModelAndView modelAndView) {
        if (userRepository.existsByEmail(email)) {
            User value = userRepository.findByEmail(email);
            modelAndView.addObject("findUserByEmail", value);
            modelAndView.setViewName("admin");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by email:" + email);
        return modelAndView;
    }

    @GetMapping("/findById")
    public ModelAndView findUserById(long id, ModelAndView modelAndView) {
        if (userRepository.existsById(id)) {
            User value = userRepository.findById(id);
            modelAndView.addObject("findUserById", value);
            modelAndView.setViewName("admin");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by ID: !" + id);
        return modelAndView;
    }

    @GetMapping("/findByRole")
    public ModelAndView findAllUserByRole(Role role, ModelAndView modelAndView) {
        if (userRepository.existsByRole(role)) {
            List<User> value = userRepository.findAllByRole(role);
            modelAndView.addObject("findAllByRole", value);
            modelAndView.setViewName("admin");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by role: " + role);
        return modelAndView;
    }
    @DeleteMapping("/deleteById")
    public ModelAndView delUserById(long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.deleteById(id);
            modelAndView.setViewName("admin");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by ID:" + id);
        return modelAndView;
    }
}
