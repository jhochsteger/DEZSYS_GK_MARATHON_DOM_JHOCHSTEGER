package sectionpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;
import sectionpark.model.ParkRechnerData;
import sectionpark.model.TimingstationData;
import sectionpark.repository.SectionparkRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    ControlCenter controlCenter;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
