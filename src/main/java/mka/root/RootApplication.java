package mka.root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // this class is a request handler (a REST controller).
public class RootApplication {

    // accept connection http://localhost:8080
    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }

}
