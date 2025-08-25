package dev.breno5g.spring_clean;

import org.springframework.boot.SpringApplication;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCleanApplication {

	public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(
                e -> System.setProperty(e.getKey(), e.getValue())
        );
        SpringApplication.run(SpringCleanApplication.class, args);
	}

}
