package in.alme.fcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableMongoRepositories
@SpringBootApplication
@RestController
public class FccApplication {

    public static void main(String[] args) {
        SpringApplication.run(FccApplication.class, args);
    }
    @GetMapping
    public String getRoot(){
        return "Hello,World";
    }
}
