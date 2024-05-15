package kursovaya.demo.controllers;

import kursovaya.demo.models.Game;
import kursovaya.demo.service.MyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/games")
public class GameController {
    private final MyService service;

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        service.addObject(game);
        return game;
    }

    @GetMapping
    public List<Game> findAllGames(){
        //todo
        return service.findAllGames();
    }
}