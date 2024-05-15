package kursovaya.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name="game")
public class Game {
    @Id
    private String name;
    @Column
    public Date creationDate;
}
