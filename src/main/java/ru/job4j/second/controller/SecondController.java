package ru.job4j.second.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.second.service.SecondService;

@RestController
@RequestMapping("/two")
public class SecondController {
    private static final Logger log = LoggerFactory.getLogger(SecondController.class);

    private final SecondService secondService;

    public SecondController(SecondService secondService) {
        this.secondService = secondService;
    }

    @GetMapping("/test")
    public ResponseEntity<HttpStatus> test() {
        log.info("вызов метода test");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/hi")
    public ResponseEntity<String> sayHello() {
        log.info("вызов метода hi");
        return new ResponseEntity<>(secondService.getWord(), HttpStatus.OK);
    }
}
