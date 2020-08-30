package my_diploma_work.controller;

import my_diploma_work.service.UserNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {

        @ExceptionHandler(IllegalArgumentException.class)
        public String ex(IllegalArgumentException ex, Model model) {
            String message = ex.getMessage();
            model.addAttribute("message", message);
            return "error";
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
            model.addAttribute("massage", message);
            return "error";
        }
}
