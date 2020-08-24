package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import static my_diploma_work.domain.user.Role.ADMINISTRATOR;
import static my_diploma_work.domain.user.Role.USER;


@Data
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

//    public String add(Model model) {
////        User admin = new User(1, "Admin", "Adminski", "Admin1234", "admin@mail.ru", "+375-29-111-11-11", ADMINISTRATOR);
////        User userNew = new User(2, "User", "Userski", "User1234", "user@mail.ru", "+375-29-111-11-11", USER);
////        userRepository.save(admin);
////        userRepository.save(userNew);
////        model.addAttribute("user", new User());
////        return "reg";
//    }


    @PostMapping("/reg")
    public ModelAndView reg(User user, ModelAndView modelAndView) {
        userRepository.save(user);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }


    @GetMapping("/auth")
    public String add(Model model) {
        User admin = new User(1, "Admin", "Adminski", "Admin1234", "admin@mail.ru", "+375-29-111-11-11", ADMINISTRATOR);
        User userNew = new User(2, "User", "Userski", "User1234", "user@mail.ru", "+375-29-111-11-11", USER);
        userRepository.save(admin);
        userRepository.save(userNew);
        model.addAttribute("user", new User());
        return "auth";
    }

    @PostMapping("/auth")
    public ModelAndView auth(String email, String password, ModelAndView modelAndView, HttpSession httpSession) {
        User userByEmail = userRepository.findByEmail(email);
        if (userByEmail.getPassword().equals(password)) {
            httpSession.setAttribute("user", userByEmail);
            httpSession.setAttribute("checkAuth", true);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        } else {
            modelAndView.addObject("massage", "Invalid authorization!");
        }
        return modelAndView;
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/";
    }
}