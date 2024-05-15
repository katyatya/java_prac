package kursovaya.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Level {
    public String complexity;
    public String levelName;
}
