package sectionpark.controller;

import sectionpark.model.TimingstationData;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    public Map<String, TimingstationData> timingstations = new HashMap<>();

    public Map<String, TimingstationData> getTimingstations() {
        return timingstations;
    }

    // Put data in global cache variable
    public void putTimingstation(String key, TimingstationData value) {
        if (timingstations.containsKey(key)) {
            timingstations.get(key).addCompetitionData(value.getCompetitionData());
        } else {
            timingstations.put(key, value);
        }

    }
}
