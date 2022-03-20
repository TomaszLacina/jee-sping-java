package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
//@Service
//@Repository
//@Controller
public class HelloWorld {

    private final String filename;

    public HelloWorld(@Qualifier("TomaszLacina") String filename) {
        this.filename = filename;

        System.out.println(this.filename);
    }

    public void hello(){
        System.out.println(LocalDateTime.now());
    }
}
