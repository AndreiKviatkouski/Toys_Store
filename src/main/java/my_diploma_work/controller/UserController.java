package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import static my_diploma_work.domain.user.Role.USER;


@Data
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    //    {
//        User admin=new User(1,"admin","Admin","Adminski","1/1/20","admin","admin@mail.ru","+375-29-111-11-11",ADMINISTRATOR);
//        User user=new User(2,"user","User","Userski","1/1/20","user","user@mail.ru","+375-29-111-11-12",USER);
//       userRepository.save(admin);
//       userRepository.save(user);
//    }
    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(User user, ModelAndView modelAndView) {
        modelAndView.setViewName("reg");
        userRepository.save(user);
        user.setRole(USER);
        modelAndView.addObject("user", user);
            return "redirect:/";
        }


    @GetMapping("/auth")
    public String auth() {
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(User user, ModelAndView modelAndView, HttpSession httpSession) {
        User userByEmail = userRepository.findByEmail(user.getEmail());
        if (userByEmail.getPassword().equals(user.getPassword())) {
            modelAndView.addObject("user", user);
            httpSession.setAttribute("user", userByEmail);
            httpSession.setAttribute("checkAuth", true);
            return ("redirect:/");
        } else {
            modelAndView.addObject("massage","Invalid authorization!");
        }
        return "auth";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.getServletContext();
        return "redirect:/";
    }
}