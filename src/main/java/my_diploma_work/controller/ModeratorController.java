package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.repository.ModeratorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Data
@RestController
@RequestMapping(path = "/moderator")
public class ModeratorController {
    private final ModeratorRepository moderatorRepository;

    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("moderator");
        return modelAndView;
    }

}