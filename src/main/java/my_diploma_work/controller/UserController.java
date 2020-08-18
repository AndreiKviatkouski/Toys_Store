package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

    @Data
    @RestController
    @RequestMapping(path = "/user")
    public class UserController {
        private final UserRepository userRepository;

        @PostMapping(path = "/add")
        public ResponseEntity<User> add(@RequestBody User user) {
            userRepository.save(user);
            return new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
        }

        @GetMapping(path = "/getByLogin")
        public ResponseEntity<User> getUserByLogin(@RequestBody String login) {
            return new ResponseEntity<>(userRepository.getByLogin(login), HttpStatus.OK);
        }
}