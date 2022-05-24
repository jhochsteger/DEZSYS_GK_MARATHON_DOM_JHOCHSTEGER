package sectionpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sectionpark.model.ParkRechnerData;
import sectionpark.repository.SectionparkRepository;

@Service
public class ControlCenter {

    @Autowired
    private SectionparkRepository repository;

    @Scheduled(fixedDelay = 10000L)
    public void update() throws Exception {

        String url = "http://localhost:8081/api/parkrechner";
        RestTemplate restTemplate = new RestTemplate();
        ParkRechnerData parkRechnerData =  restTemplate.getForObject(url, ParkRechnerData.class);
        System.out.println(parkRechnerData);
        assert parkRechnerData != null;
        repository.save(parkRechnerData);
//		// save a couple of timing station data
////		repository.save(new TimingstationData("1","1","2022-01-01 01:00:00", 20.0, "c"));
////		repository.save(new TimingstationData("2","1","2022-01-02 02:00:00", 20.5, "c"));
//
//		// fetch all customers
//		System.out.println("Windengine data found with findAll():");
//		System.out.println("-------------------------------");
//		for (ParkRechnerData parkRechnerData1 : repository.findAll()) {
//			System.out.println(parkRechnerData1);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Record(s) found with findByTimingstationID(\"1\"):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByParkRechnerID("1"));
//
//		System.out.println("Record(s) found with findBySectionparkID(\"1\"):");
//		System.out.println("--------------------------------");
//		for (ParkRechnerData parkRechnerData1 : repository.findByParkRechnerID("1")) {
//			System.out.println(parkRechnerData1);
//		}

    }

}
