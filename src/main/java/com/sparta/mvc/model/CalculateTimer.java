package com.sparta.mvc.model;

public class CalculateTimer {
    private long startTime = System.nanoTime();
    private long endTime = System.nanoTime();

    public void getStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public float timeResult(long start, long end) {
        return (end - start);
    }
}
