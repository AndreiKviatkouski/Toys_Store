package my_diploma_work.controller;


import lombok.Data;
import my_diploma_work.domain.toys.Format;
import my_diploma_work.domain.toys.StatusToy;
import my_diploma_work.domain.toys.Toy;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.ToyRepository;
import my_diploma_work.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

import static my_diploma_work.domain.user.Role.*;


@Data
@Controller
@RequestMapping(path = "/")
public class HomepageController {

    private final ToyRepository toyRepository;
    private final UserRepository userRepository;

    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");

        List<Toy> all = toyRepository.findAll();
        Toy toy1 = new Toy("Spong Bob", Format.DOLLS, StatusToy.IN_STOCK, "USA", BigDecimal.valueOf(10), "Popular USA toy", "https://www.tokkoro.com/picsup/5417120-spongebob-wallpapers.jpg");
        Toy toy2 = new Toy("Mascha", Format.SOFT_TOYS, StatusToy.IN_STOCK, "Russia", BigDecimal.valueOf(20), "Popular Russia toy", "https://s.fishki.net/upload/users/2019/01/01/429388/1e347e602d24a5632c58f615d4f0155c.jpg");
        Toy toy3 = new Toy("Mario", Format.CONSTRUCTOR, StatusToy.IN_STOCK, "Denmark", BigDecimal.valueOf(30), "Popular Denmark toy", "https://i5.walmartimages.com/asr/f69e8b84-5017-43bc-ae17-b55729f0f878_1.b6e6b7ab7277e557918a3bff6be25db5.jpeg");
        toyRepository.save(toy1);
        toyRepository.save(toy2);
        toyRepository.save(toy3);

        User admin = new User("Admin", "Adminski", "Admin1234", "admin@mail.ru", "+375-29-111-11-11",ADMINISTRATOR);
        User user = new User("User", "Userski", "User1234", "user@mail.ru", "+375-29-111-11-12");
        User moderator = new User("Moderator", "Userski", "Moderator1234", "moderator@mail.ru", "+375-29-111-11-13",MODERATOR);
        userRepository.save(admin);
        userRepository.save(user);
        userRepository.save(moderator);

        modelAndView.addObject("user",new User());// create  users when start homepage
        modelAndView.addObject("toy",new Toy());// create  toys when start homepage
        modelAndView.addObject("all", all);// creat list toys when start homepage
        return modelAndView;
    }

    @GetMapping(path = "info")
    public ModelAndView info(ModelAndView modelAndView) {
        modelAndView.setViewName("info");
        return modelAndView;
    }

    @GetMapping(path = "user")
    public ModelAndView user(ModelAndView modelAndView) {
        modelAndView.setViewName("userView");
        return modelAndView;
    }

    @GetMapping(path = "moderator")
    public ModelAndView moderator(ModelAndView modelAndView) {
        modelAndView.setViewName("moderator");
        return modelAndView;
    }

    @GetMapping(path = "order")
    public ModelAndView order(ModelAndView modelAndView) {
        modelAndView.setViewName("moderator");
        return modelAndView;
    }

    @GetMapping(path = "basket")
    public ModelAndView basket(ModelAndView modelAndView) {
        modelAndView.setViewName("basket");
        return modelAndView;
    }

    @GetMapping(path = "admin")
    public ModelAndView admin(ModelAndView modelAndView) {
        modelAndView.setViewName("admin");
        return modelAndView;
    }

    @GetMapping(path = "toy")
    public ModelAndView toy(ModelAndView modelAndView) {
        modelAndView.setViewName("toyView");
        return modelAndView;
    }
}


