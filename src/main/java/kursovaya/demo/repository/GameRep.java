package kursovaya.demo.repository;

import kursovaya.demo.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRep extends JpaRepository<Game, Long> {
    Game deleteByName(String name);
}
