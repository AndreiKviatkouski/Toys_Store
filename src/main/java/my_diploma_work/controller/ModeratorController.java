package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.repository.ModeratorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Data
@Controller
@RequestMapping(path = "/moderator")
public class ModeratorController {
    private final ModeratorRepository moderatorRepository;

}