package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

import static my_diploma_work.domain.user.Role.*;


@Data
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/findByEmail")
    public ModelAndView findByEmail(String email, ModelAndView modelAndView) {
        List<User> userList = userRepository.findAll();
        for (User value : userList) {
            if (value.getEmail().equals(email)) {
                modelAndView.addObject("findUserByEmail", value);
                modelAndView.setViewName("redirect:/");
                return modelAndView;
            }

        }
        return modelAndView;
    }

    @GetMapping("/findById")
    public ModelAndView findById(long id, ModelAndView modelAndView) {
        List<User> userList = userRepository.findAll();
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                User user = userList.get(i);
                modelAndView.addObject("findUserById", user);
                modelAndView.setViewName("redirect:/");
                return modelAndView;
            }

        }
        return modelAndView;
    }

    @GetMapping("/findByRole")
    public ModelAndView findByRole(Role role, ModelAndView modelAndView) {
        List<User> userList = userRepository.findAll();
        for (int i = 0, userListSize = userList.size(); i < userListSize; i++) {
            User value = userList.get(i);
            if (value.getRole().equals(role)) {
                modelAndView.addObject("findUserByRole", value);
                modelAndView.setViewName("redirect:/");
                return modelAndView;
            }

        }
        return modelAndView;
    }

    @DeleteMapping("deleteById")
    public ModelAndView delById(long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.deleteById(id);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found!");
        return modelAndView;
    }


    @DeleteMapping("delete")
    public ModelAndView delete(User user, ModelAndView modelAndView) {
        List<User> userList = userRepository.findAll();
        if (userList.contains(user)) {
            userRepository.delete(user);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found!");
        return modelAndView;
    }

    @PutMapping("/updateByEmail")
    public ModelAndView updateByEmail(String email, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByEmail(email, id);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found!");
        return modelAndView;
    }

    @PutMapping("/updateByTel")
    public ModelAndView updateByTel(String telephone, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByTelephone(telephone, id);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found!");
        return modelAndView;
    }

    @PutMapping("/updateByFirstName")
    public ModelAndView updateByFirsName(String firstName, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByFirstName(firstName, id);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found!");
        return modelAndView;
    }

    @PutMapping("/updateByLastName")
    public ModelAndView updateByLastName(String lastName, long id, ModelAndView modelAndView) {
        if (userRepository.existsUserById(id)) {
            userRepository.updateUserByLastName(lastName, id);
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.addObject("massage", "User not found!");
        return modelAndView;
    }

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

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
            if (userByEmail.getRole() == ADMINISTRATOR) {
                httpSession.setAttribute("checkAuthAdmin", true);
            } else if (userByEmail.getRole() == MODERATOR) {
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