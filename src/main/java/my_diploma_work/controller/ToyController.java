package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.toys.Estimation;
import my_diploma_work.domain.toys.Format;
import my_diploma_work.domain.toys.StatusToy;
import my_diploma_work.domain.toys.Toy;
import my_diploma_work.repository.ToyRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

import static my_diploma_work.domain.toys.Format.*;
import static my_diploma_work.domain.toys.StatusToy.IN_STOCK;
import static my_diploma_work.domain.toys.StatusToy.SOLD;

@Data
@RestController
@RequestMapping(path = "/toy")// переходит по /toy на следующую  modelAndView.setViewName("имя View"), например toyView.ftl;
public class ToyController {

    private final ToyRepository toyRepository;

    @GetMapping
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("toyView");
        return modelAndView;
    }

    @GetMapping("/addToy")
    public String add(Model model) {
        Toy toy1 = new Toy(1, "Sponge Bob", SOFT_TOYS, IN_STOCK, "USA", BigDecimal.valueOf(10), "Popular USA toy");
        Toy toy2 = new Toy(2, "Mascha", DOLLS, IN_STOCK, "RUSSIA", BigDecimal.valueOf(20), "Popular RUSSIA toy");
        Toy toy3 = new Toy(3, "Lego Mario", CONSTRUCTOR, SOLD, "DENMARK", BigDecimal.valueOf(30), "Popular DENMARK toy");
        toyRepository.save(toy1);
        toyRepository.save(toy2);
        toyRepository.save(toy3);
        model.addAttribute("toy", new Toy());
        return "toyView";
    }

    @PostMapping("/addToy")
    public ModelAndView add(Toy toy, ModelAndView modelAndView) {
        if (!toyRepository.existsByName(toy.getName())) {
            toyRepository.save(toy);
            modelAndView.setViewName("redirect:/toyView");
        } else {
            modelAndView.addObject("massage", "Toy already exist");
            modelAndView.setViewName("toyView");
        }
        return modelAndView;
    }

    @GetMapping("/findById")
    public String findById(long id, ModelAndView modelAndView) {
        if (toyRepository.existsToyById(id)) {
            toyRepository.findById(id);
            modelAndView.setViewName("redirect:/toyView");
        } else {
            modelAndView.addObject("massage", "Toy by id already exist. ID:" + id);
            modelAndView.setViewName("/toyView");
        }
        return "redirect:/toyView";
    }

    @GetMapping("/findByManufacturer")
    public ModelAndView findToyByManufacturer(String manufacturer, ModelAndView modelAndView) {
        if (toyRepository.existsByManufacturer(manufacturer)) {
            List<Toy> value = toyRepository.findAllByManufacturer(manufacturer);
            modelAndView.addObject("findAllByRole", value);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy by manufacturer already exist. MANUFACTURER:" + manufacturer);
        return modelAndView;
    }

    @GetMapping("/findByFormat")

    public ModelAndView findToyByFormat(Format format, ModelAndView modelAndView) {
        if (toyRepository.existsByFormat(format)) {
            List<Toy> value = toyRepository.findByFormat(format);
            modelAndView.addObject("findAllByFormat", value);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy by format already exist. FORMAT:" + format);
        return modelAndView;
    }

    @GetMapping("/findByStatus")
    public ModelAndView findByStatusToy(StatusToy statusToy, ModelAndView modelAndView) {
        if (toyRepository.existsToyByStatusToy(statusToy)) {
            List<Toy> value = toyRepository.findByStatusToy(statusToy);
            modelAndView.addObject("findAllByStatus", value);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy by status already exist. FORMAT:" + statusToy);
        return modelAndView;
    }

    @GetMapping("/findByEstimation")
    public ModelAndView findToyByEstimation(Estimation estimation, ModelAndView modelAndView) {
        if (toyRepository.existsToyByEstimation(estimation)) {
            List<Toy> value = toyRepository.findByEstimation(estimation);
            modelAndView.addObject("findAllByEstimation", value);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy by estimation already exist. ESTIMATION:" + estimation);
        return modelAndView;
    }

    @GetMapping("/findByPrice")
    public ModelAndView findToyByPrice(BigDecimal price, ModelAndView modelAndView) {
        if (toyRepository.existsToyByPrice(price)) {
            List<Toy> value = toyRepository.findByPrice(price);
            modelAndView.addObject("findAllByPrice", value);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy by price already exist. PRICE:" + price);
        return modelAndView;
    }

    @GetMapping("/findAll")
    public String findAll(ModelAndView modelAndView) {
        List<Toy> value = toyRepository.findAll();
        modelAndView.addObject("toy", value);
        return "toyView";
    }

    @DeleteMapping("/deleteToyById")
    public ModelAndView delToyById(long id, ModelAndView modelAndView) {
        if (toyRepository.existsById(id)) {
            toyRepository.deleteById(id);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy not found by ID:" + id);
        return modelAndView;
    }

    @PutMapping("/updateToyByName")
    public ModelAndView updateToyByName(String name, long id, ModelAndView modelAndView) {
        if (toyRepository.existsById(id)) {
            toyRepository.updateToyByName(name, id);
            modelAndView.setViewName("toyView");
            return modelAndView;
        }
        modelAndView.addObject("massage", "Toy not found by Name:" + name);
        return modelAndView;
    }

}
