package my_diploma_work.controller;

import lombok.Data;

import my_diploma_work.domain.toys.Toy;
import my_diploma_work.repository.ToyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static my_diploma_work.domain.user.Role.USER;

@Data
@RestController
@RequestMapping("/toy")
public class ToyController {

    private final ToyRepository toyRepository;


    @PostMapping("/add")
    public String add(Toy toy, ModelAndView modelAndView) {
        modelAndView.setViewName("reg");
        toyRepository.save(toy);
        modelAndView.addObject("toy", toy);
        return "toy";
    }

//    @GetMapping("/findById")
//    public ResponseEntity<Toy> findById(@RequestBody long id) {
//        return new ResponseEntity<>(toyRepository.findById(id), HttpStatus.OK);
//    }
//
//    @GetMapping("/getByManufacturer")
//    public ResponseEntity<List<Toy>> getToyByManufacturer(@RequestBody String manufacturer) {
//        List<Toy> byManufacturer = toyRepository.findAllByManufacturer(manufacturer);
//        for (int i = 0; i < byManufacturer.size(); i++) {
//            if (byManufacturer.get(i).getManufacturer().contains(manufacturer)) {
//                return new ResponseEntity<>(byManufacturer, HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }
}
