package cz.mailmuni.andirs.jokeapp;

import cz.mailmuni.andirs.jokeapp.services.ChuckNorrisJokeService;
import cz.mailmuni.andirs.jokeapp.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml ")
public class JokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeAppApplication.class, args);
	}

}
