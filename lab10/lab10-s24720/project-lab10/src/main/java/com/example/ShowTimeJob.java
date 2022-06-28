package com.example;

import java.time.LocalDateTime;

public class ShowTimeJob implements Job {

    public LocalDateTime time;
    
    public ShowTimeJob(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(time);
    }

    public void setJobTime(LocalDateTime plusSeconds) {
        this.time=plusSeconds;
    }

    @Override
    public LocalDateTime getJobTime(LocalDateTime time) {
        return time;
    }
}
