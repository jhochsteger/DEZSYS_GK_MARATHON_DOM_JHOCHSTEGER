package sectionpark.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ParkRechnerData implements Serializable {
    private static final long serialVersionUID = 300002228479017363L;

    public String parkRechnerId;

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

    @Override
    public String toString() {
        return "ParkRechnerData{" +
                "parkRechnerId='" + parkRechnerId + '\'' +
                ", timingstations=" + timingstations +
                '}';
    }
}
