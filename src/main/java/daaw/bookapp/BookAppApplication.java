package daaw.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("daaw.bookapp.persistence.repo")
@EntityScan("daaw.bookapp.persistence.model")
@SpringBootApplication
public class BookAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}
}