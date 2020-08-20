package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.domain.user.Role;
import my_diploma_work.domain.user.User;
import my_diploma_work.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping(path = "/findByLogin")
    public ResponseEntity<User> getUserByLogin(@RequestBody String login) {
        return new ResponseEntity<>(userRepository.findByLogin(login), HttpStatus.OK);
    }

    @GetMapping(path = "/findById")
    public ResponseEntity<User> getUserById(@RequestBody long id) {
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/auth")
    public ResponseEntity<User> getUserByPassword(@RequestParam String login, @RequestParam String password) {
        User byLogin = userRepository.findByLogin(login);
        if (byLogin.getPassword().equals(password)) {
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.LOCKED);
    }

    @GetMapping(path = "/findAllByRoll")
    public ResponseEntity<List<User>> getAllByRoll(@RequestParam Role role) {
        List<User> userList = userRepository.findAllByRole(role);
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getRole().equals(role)) {
                return new ResponseEntity<>(List.copyOf(userList), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/findAllByBirthDate")
    public ResponseEntity<List<User>> getALLByBirthDate(@RequestParam String birthDate) {
        List<User> userList = userRepository.findAllByBirthDate(birthDate);
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getBirthDate().equals(birthDate)) {
                return new ResponseEntity<>(List.copyOf(userList), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<List<User>> getALL() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);

    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<User> add(@RequestBody Long id) {
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
//
//    @PostMapping(path = "/updateUserByLogin")
//    public ResponseEntity<User> updateUser(@RequestParam String login, @RequestParam long id) {
//        userRepository.DAO
//        for (int i = 0; i < userList.size(); i++) {
//            if (userList.get(i).getId() == id) {
//                User newUser = userList.get(i).setLogin(login);
//                return new ResponseEntity<>(newUser, HttpStatus.OK)
//            }
//        }
//        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//    }

}

