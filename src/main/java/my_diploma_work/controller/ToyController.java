package my_diploma_work.controller;

import lombok.Data;

import my_diploma_work.domain.toys.StatusToy;
import my_diploma_work.domain.toys.Toy;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.ToyRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/toy")
public class ToyController {

    private final ToyRepository toyRepository;


    @PostMapping(path = "/add")
    public ResponseEntity<Toy> add(@RequestBody Toy toy) {
        toyRepository.save(toy);
        return new ResponseEntity<>(toyRepository.save(toy), HttpStatus.CREATED);
    }

    @GetMapping(path = "/getByName")
    public ResponseEntity<Toy> getToyByName(@RequestBody long id) {
        return new ResponseEntity<>(toyRepository.getById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/getByManufacturer")
    public ResponseEntity<Toy> getToyByManufacturer(@RequestBody String manufacturer) {
        List<Toy> byManufacturer = toyRepository.getAllByManufacturer(manufacturer);
        if (byManufacturer.contains(manufacturer)) {
//            return new ResponseEntity<>(manufacturer, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
