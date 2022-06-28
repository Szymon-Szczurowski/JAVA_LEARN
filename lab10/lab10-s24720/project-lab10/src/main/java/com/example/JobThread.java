package com.example;

import java.time.LocalDateTime;

public class JobThread extends Thread {

    Job job;
    public JobThread(Job job) {
        this.job = job;
    }

    public void run(){
        this.job.run();
    }

}
