package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.ToyRepository;
import my_diploma_work.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import static my_diploma_work.domain.user.Role.*;


@Data
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final ToyRepository toyRepository;

    @PutMapping("/updateByEmail")
    public ModelAndView updateByEmail(String email, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByEmail(email, id);
            modelAndView.setViewName("redirect:/user");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by email:" + email);
        return modelAndView;
    }

    @PutMapping("/updateByTel")
    public ModelAndView updateByTel(String telephone, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByTelephone(telephone, id);
            modelAndView.setViewName("redirect:/user");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by phone: " + telephone);
        return modelAndView;
    }

    @PutMapping("/updateByFirstName")
    public ModelAndView updateByFirsName(String firstName, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByFirstName(firstName, id);
            modelAndView.setViewName("redirect:/user");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by FirstName: " + firstName);
        return modelAndView;
    }

    @PutMapping("/updateByLastName")
    public ModelAndView updateByLastName(String lastName, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByLastName(lastName, id);
            modelAndView.setViewName("redirect:/user");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found by LastName:" + lastName);
        return modelAndView;
    }


    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @PostMapping("/reg")
    public ModelAndView reg(User user, ModelAndView modelAndView) {

        if (!userRepository.existsByEmailAndTelephone(user.getEmail(), user.getTelephone())) {
            userRepository.save(user);
            modelAndView.setViewName("redirect:/");
        } else {
            modelAndView.addObject("massage", "User already exist");
            modelAndView.setViewName("reg");
        }
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
            httpSession.setAttribute("user", userByEmail.getFirstName() + " " + userByEmail.getLastName());
            if (userByEmail.getRole() == ADMINISTRATOR) {
                httpSession.setAttribute("checkAuthAdmin", true);
            }
            if (userByEmail.getRole() == MODERATOR) {
                httpSession.setAttribute("checkAuthModerator", true);
            }
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