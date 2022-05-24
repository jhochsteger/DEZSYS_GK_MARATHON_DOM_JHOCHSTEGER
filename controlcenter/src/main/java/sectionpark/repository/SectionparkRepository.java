package sectionpark.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import sectionpark.model.ParkRechnerData;

public interface SectionparkRepository extends MongoRepository<ParkRechnerData, String> {

    public List<ParkRechnerData> findByParkRechnerId(String parkRechnerId);

 }
