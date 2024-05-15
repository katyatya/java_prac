package kursovaya.demo.repository;

import kursovaya.demo.models.Game;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class GameRepository {
    private final List<Game> GAMES=new ArrayList<>();

    public List<Game> findAll(){
        return GAMES;
    }

    public Game save(Game game) {
        GAMES.add(game);
        return game;
    }

}
