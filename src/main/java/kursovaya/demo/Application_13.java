package kursovaya.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application_13 implements CommandLineRunner {

    @Value("${student.name}")
    private String name;

    @Value("${student.last_name}")
    private String lastName;

    @Value("${student.group}")
    private String group;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Имя студента: " + name);
        System.out.println("Фамилия студента: " + lastName);
        System.out.println("Группа студента: " + group);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application_13.class, args);
    }
}

