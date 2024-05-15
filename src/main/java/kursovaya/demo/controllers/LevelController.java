//package kursovaya.demo.controllers;
//
//import kursovaya.demo.models.Level;
//import org.springframework.web.bind.annotation.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/levels")
//public class LevelController {
//    private List<Level> levels = new ArrayList<>();
//
//    @PostMapping
//    public Level createLevel(@RequestBody Level level) {
//        levels.add(level);
//        return level;
//    }
//
//    @GetMapping
//    public List<Level> getLevels() {
//        return levels;
//    }
//
//    @DeleteMapping("/{index}")
//    public void deleteLevel(@PathVariable int index) {
//        levels.remove(index);
//    }
//}