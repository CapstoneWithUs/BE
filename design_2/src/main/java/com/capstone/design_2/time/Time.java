package com.capstone.design_2.time;

import java.time.LocalDateTime;

public class Time {
    private LocalDateTime startTime;  // 공부 시작 시간
    private LocalDateTime endTime;  // 공부 종료 시간


    public Time() {
        this.startTime = LocalDateTime.now();
        this.endTime = LocalDateTime.now();
    }

    public Time(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }



    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
