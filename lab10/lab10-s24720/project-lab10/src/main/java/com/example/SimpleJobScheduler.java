package com.example;

import java.time.LocalDateTime;

public class SimpleJobScheduler implements JobScheduler {

    Job job;
     LocalDateTime time;
    int seconds;
    int times;
    TimeEvent event;

    @Override
    public JobScheduler forJob(Job job) {
        this.job = job;
        return this;
    }

    @Override
    public JobScheduler startsAt(LocalDateTime time) {
        this.time = time;
        return this;

    }

    @Override
    public JobScheduler everySeconds(int i) {
        this.seconds = i;
        return this;

    }

    @Override
    public void repeatTimes(int i) {
        this.times = i;

    }

    @Override
    public void listenTo(TimeEvent event) {
        this.event = event;
    }
}
