package sectionpark.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimingstationData implements Serializable {
	private static final long serialVersionUID = 300002228479017363L;

	private String timingstationID;
	private String timestamp;

	private double distance;
	private String unitDistance;

	private double altitude;
	private String unitAltitude;

	private CompetitionData competitionData;



	/**
	 * Constructor
	 */
	public TimingstationData() {

		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.unitDistance = "km";
		this.unitAltitude = "m";

	}

	/**
	 * Setter and Getter Methods
	 */
	public String getTimingstationID() {
		return timingstationID;
	}

	public void setTimingstationID(String timingstationID) {
		this.timingstationID = timingstationID;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getUnitDistance() {
		return unitDistance;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getUnitAltitude() {
		return unitAltitude;
	}

	public CompetitionData getCompetitionData() {
		return competitionData;
	}

	public void setCompetitionData(CompetitionData competitionData) {
		this.competitionData = competitionData;
	}

	public void addCompetitionData(CompetitionData competitionData) {
		this.competitionData.addRunners(competitionData.getRunners());
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Timing Station Info: ID = %s, timestamp = %s, distance = %d",
			timingstationID, timestamp, distance );
		return info;
	}
}
