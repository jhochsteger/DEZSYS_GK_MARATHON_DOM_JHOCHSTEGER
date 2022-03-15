package sectionpark;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sectionpark.jms.JmsProducer;
import sectionpark.timingstation.TimingstationSimulation;

import java.util.Timer;
import java.util.TimerTask;

@Service
@Slf4j
public class Timingstation {

    @Value("${timingstation.id}")
    private String id;

    @Autowired
    JmsProducer jmsProducer;

    @Autowired
    TimingstationSimulation timingstationSimulation;

    @Value("${active-mq.topic-prefix}")
    private String topic_prefix;

    @Scheduled(fixedDelay = 10000L)
    public void run() {
        jmsProducer.sendMessage(timingstationSimulation.getData(this.id), this.topic_prefix + this.id);
    }

}
