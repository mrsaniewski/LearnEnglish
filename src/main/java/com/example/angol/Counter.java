package com.example.angol;

import javafx.event.ActionEvent;

public class Counter {

    private static Counter COUNTER;

    private final int maxPointsCount;

    private int pointsCount;

    private Counter(int maxPointsCount) {
        this.maxPointsCount = maxPointsCount;
        this.pointsCount = 0;
    }

    public void addPoints(int pointsCount) {
        this.pointsCount += pointsCount;
    }
    public void zeroPoints(int pointsCount) {this.pointsCount = pointsCount;}

    public int getMaxPointsCount() {
        return maxPointsCount;
    }

    public int getPointsCount() {
        return pointsCount;
    }

    public static Counter getInstance() {
        if (COUNTER == null)
        {
            COUNTER = new Counter(8);
        }

        return COUNTER;
    }


}
