package mka.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // this class is a request handler (a REST controller).
public class RootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }

    // accept connection http://localhost:8080/index or http://localhost:8080
    // maps the indexPage to GET requests for / and /index
    @GetMapping({"/","/index"})
    // RequestParam annotation maps the name method to the myName
    public String indexPage(@RequestParam(value="myName", defaultValue = "Turkey") String name){
        return String.format("Hello %s!", name);
    }

}
