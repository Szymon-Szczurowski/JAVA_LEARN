package com.example;

import java.time.LocalDateTime;

public class DescribedJob implements Job {

    public String description;
    private LocalDateTime time;

    public DescribedJob(String description) {
        this.description = description;
    }


    @Override
    public void run() {
        System.out.println(description);
    }

    @Override
    public void setJobTime(LocalDateTime plusSeconds) {
        this.time = plusSeconds;

    }

    @Override
    public LocalDateTime getJobTime(LocalDateTime time) {
        return time;
    }
}