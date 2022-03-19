package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.HelloWorld;

@Configuration
@ComponentScan //Adnotacja która będzie mi szukać beanów w projekcie - w tym pakiecie i w pakietach które są niżej w hierarchi !!!
public class AppConfig {

    /** Tutaj zostao zakomentowane, dlatego żeby spróbować zrobić za pomocą
     * tylko adnotacji bez jawnego tworzenia sobie beana
     *
     * Proszę sobie odkomentować

    @Bean("helloWorld")
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

     */
}
