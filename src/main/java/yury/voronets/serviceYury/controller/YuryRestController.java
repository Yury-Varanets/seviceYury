package yury.voronets.serviceYury.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/messages")
public class YuryRestController {

    private List<String> messages = Stream.of("Yury1", "Yury2", "Yury3").collect(Collectors.toList());

    @GetMapping
    public List<String> getAllMessages() {
        return messages;
    }
}
