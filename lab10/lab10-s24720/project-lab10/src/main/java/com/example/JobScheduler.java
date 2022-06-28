package com.example;

import java.time.LocalDateTime;

public interface JobScheduler {

    JobScheduler forJob(Job job);

    JobScheduler startsAt(LocalDateTime plusSeconds);

    JobScheduler everySeconds(int i);

    void repeatTimes(int i);

    void listenTo(TimeEvent event);
}
