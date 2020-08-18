package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.service.UserNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping(path = "/error")
public class ExceptionController {

        @ExceptionHandler(IllegalArgumentException.class)
        public String ex(IllegalArgumentException ex, Model model) {
            String message = ex.getMessage();
            model.addAttribute("message", message);
            return "main";
        }

        @ExceptionHandler(NullPointerException.class)
        public String ex(NullPointerException ex, Model model) {
            String message = ex.getMessage();
            model.addAttribute("message", message);
            return "error";
        }

        @ExceptionHandler(UserNotFoundException.class)
        public String ex(UserNotFoundException ex, Model model) {
            String message = ex.getMessage();
            model.addAttribute("error", message);
            return "auth";
        }
}
