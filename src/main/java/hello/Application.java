package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Klasa odpowiedzialna za uruchomienie aplikacji z frameworkiem Spring
 */
@SpringBootApplication
public class Application {

   public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}