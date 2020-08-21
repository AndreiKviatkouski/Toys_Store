package my_diploma_work.controller;

import lombok.Data;

import my_diploma_work.domain.toys.Toy;
import my_diploma_work.repository.ToyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/toy")
public class ToyController {

    private final ToyRepository toyRepository;


    @PostMapping(path = "/add")
    public ResponseEntity<Toy> add(@RequestBody Toy toy) {
        return new ResponseEntity<>(toyRepository.save(toy), HttpStatus.CREATED);
    }

    @GetMapping(path = "/findById")
    public ResponseEntity<Toy> findById(@RequestBody long id) {
        return new ResponseEntity<>(toyRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/getByManufacturer")
    public ResponseEntity<List<Toy>> getToyByManufacturer(@RequestBody String manufacturer) {
        List<Toy> byManufacturer = toyRepository.findAllByManufacturer(manufacturer);
        for (int i = 0; i < byManufacturer.size(); i++) {
            if (byManufacturer.get(i).getManufacturer().contains(manufacturer)) {
                return new ResponseEntity<>(byManufacturer, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
