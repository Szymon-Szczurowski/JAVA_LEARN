package com.example;

import java.time.LocalDateTime;

public interface Job {
    void run();

    public void setJobTime(LocalDateTime time);
    LocalDateTime getJobTime(LocalDateTime time);



}
