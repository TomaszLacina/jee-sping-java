package pl.coderslab.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Component
//@Service
//@Repository
//@Controller
public class HelloWorld {

    public void hello(){
        System.out.println(LocalDateTime.now());
    }
}
