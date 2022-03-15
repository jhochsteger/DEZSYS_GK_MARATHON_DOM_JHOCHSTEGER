package sectionpark.model;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class CompetitionData implements Serializable {
    private static final long serialVersionUID = 300002228479017363L;

    private RunnerData[] runners;

    /**
     * Constructor
     */
    public CompetitionData(RunnerData[] runners) {

        this.runners = runners;

    }

    /**
     * Setter and Getter Methods
     */
    public RunnerData[] getRunners() {
        return runners;
    }

    public void setRunners(RunnerData[] runners) {
        this.runners = runners;
    }

    public void addRunners(RunnerData[] runners) {
        this.runners = Stream.concat(Arrays.stream(this.runners), Arrays.stream(runners)).toArray(size -> (RunnerData[]) Array.newInstance(this.runners.getClass().getComponentType(), size));
    }

    @Override
    public String toString() {
        return "CompetitionData{" +
                "runners=" + Arrays.toString(runners) +
                '}';
    }
}