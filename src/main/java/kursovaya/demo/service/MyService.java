package kursovaya.demo.service;

import kursovaya.demo.models.Game;

import java.util.List;

public interface MyService {
    List<Game> findAllGames();
    Game addObject(Game game);

}
