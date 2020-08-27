package my_diploma_work.controller;


import lombok.Data;
import my_diploma_work.domain.toys.Toy;
import my_diploma_work.repository.ToyRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

}


