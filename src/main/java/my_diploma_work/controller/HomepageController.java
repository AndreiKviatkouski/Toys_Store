package my_diploma_work.controller;


import lombok.Data;
import my_diploma_work.repository.ToyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Data
@Controller
@RequestMapping(path = "/")
public class HomepageController {

private final ToyRepository toyRepository;

    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
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


