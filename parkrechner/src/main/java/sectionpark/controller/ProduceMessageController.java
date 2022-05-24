package sectionpark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import sectionpark.model.ParkRechnerData;
import sectionpark.model.TimingstationData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class ProduceMessageController {

    @Autowired
    ParkRechnerData parkRechnerData;

    @GetMapping("/api/timingstations")
    public Map<String, TimingstationData> getTimingstations() {
        return parkRechnerData.getTimingstations();
    }

    @GetMapping("/api/parkrechner")
    public ParkRechnerData getParkRechner() {
        return parkRechnerData;
    }
}
