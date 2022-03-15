package sectionpark;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStandaloneActivemqApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandaloneActivemqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String id = "001";
		for(String arg:args) {
			id = arg;
		}

		new Timingstation();

	}

}
