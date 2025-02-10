package cl.com.jorge.screenmatch;

import cl.com.jorge.screenmatch.principal.Principal;
import cl.com.jorge.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

}
