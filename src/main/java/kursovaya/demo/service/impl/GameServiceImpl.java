package kursovaya.demo.service.impl;

import kursovaya.demo.models.Game;
import kursovaya.demo.repository.GameRep;
import kursovaya.demo.repository.GameRepository;
import kursovaya.demo.service.MyService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@AllArgsConstructor
@Primary
@Service
public class GameServiceImpl implements MyService {
    private final GameRep repository;
    @Override
    public Game addObject(Game game) {
        return repository.save(game);
    }

    @Override
    public List<Game> findAllGames() {
        return repository.findAll();
    }

//    @Override
//    public Game deleteByName(String name) {
//        return repository.deleteByName(name);
//    }
}
