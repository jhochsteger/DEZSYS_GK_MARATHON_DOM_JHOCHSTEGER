package sectionpark.timingstation;

import org.springframework.stereotype.Component;
import sectionpark.model.CompetitionData;
import sectionpark.model.RunnerData;
import sectionpark.model.TimingstationData;

import java.time.LocalTime;
import java.util.ArrayList;

@Component
public class TimingstationSimulation {

	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
		return roundDouble(number);

	}

	private double roundDouble(double number) {
		return Math.round(number * 100.0) / 100.0;
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
		Long rounded = Math.round(number);
		return rounded.intValue();

	}

	private CompetitionData createCompetitionData(double doubleTimingstationID) {
		int numRunners = getRandomInt(1,10);
		RunnerData[] runners = new RunnerData[numRunners];
		for (int i = 0; i < numRunners; i++) {
			runners[i] = createRunnerData(doubleTimingstationID);
		}
		return new CompetitionData(runners);
	}

	public RunnerData createRunnerData(double doubleTimingstationID) {
		LocalTime time = LocalTime.ofSecondOfDay((int) ( getRandomInt(330, 360) * doubleTimingstationID));
		return new RunnerData(getRandomInt(1,10000), "" + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
	}

	public TimingstationData getData( String inTimingstationID ) {

		double doubleTimingstationID = Double.parseDouble(inTimingstationID);

		TimingstationData data = new TimingstationData();
		data.setTimingstationID(inTimingstationID);
		data.setDistance(doubleTimingstationID);
		data.setAltitude(roundDouble(Math.sin(doubleTimingstationID*(Math.PI/12))*195.5+346.5));
		data.setCompetitionData(createCompetitionData(doubleTimingstationID));

		return data;

	}

}
