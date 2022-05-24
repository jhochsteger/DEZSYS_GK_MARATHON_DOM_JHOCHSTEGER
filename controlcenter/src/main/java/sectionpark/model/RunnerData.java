package sectionpark.model;

import java.io.Serializable;

public class RunnerData implements Serializable {
    private static final long serialVersionUID = 300002228479017363L;

    private int runnerID;
    private String timing;
    private String unitTiming;

    /**
     * Constructor
     */
    public RunnerData(int runnerID, String timing) {

        this.runnerID = runnerID;
        this.timing = timing;
        this.unitTiming = "hh:mm:ss";

    }

    public RunnerData() {

    }

    /**
     * Setter and Getter Methods
     */
    public int getRunnerID() {
        return runnerID;
    }

    public void setRunnerID(int runnerID) {
        this.runnerID = runnerID;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getUnitTiming() {
        return unitTiming;
    }

    @Override
    public String toString() {
        return "RunnerData{" +
                "runnerID=" + runnerID +
                ", timing='" + timing + '\'' +
                ", unitTiming='" + unitTiming + '\'' +
                '}';
    }
}
