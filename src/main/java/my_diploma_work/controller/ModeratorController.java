package my_diploma_work.controller;

import lombok.Data;
import my_diploma_work.repository.ModeratorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping(path = "/moderator")
public class ModeratorController {
    private final ModeratorRepository moderatorRepository;

}