package raisetech.Studentmanagement1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Studentmanagement1Application {

    public static void main(String[] args) {
        SpringApplication.run(Studentmanagement1Application.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
    return "Hello,World!";
    }
}
