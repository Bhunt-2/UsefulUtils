package com.bhunt.usefulutils;

import java.util.Deque;

public final class GeneralUtils {

    private GeneralUtils() {}

    
    public static <T> void addToDequeHistory(Deque<T> deque, T value, int maxSize) { // adds a value to the end of the deque, and removes the first value if the deque is at max size
        if (maxSize <= 0) {
        throw new IllegalArgumentException("maxSize must be greater than 0");
    }

    if (deque.size() >= maxSize) {
        deque.removeFirst();
    } else {
        deque.addLast(value);
    }
    

    //useage example:
    //Deque<Double> name = new ArrayDeque<>();
    //GeneralUtils.addToDequeHistory(name, value, 5); // adds value to the end of the deque, and removes the first value if the deque is at max size of 5
}
    @Deprecated
    public static double[] decay(double currentValue, double value1, double value2, double value3, double value4, double value5) { // returns an array of the last 5 values, with the current value added to the front and the oldest value removed from the back
        
        value5 = value4;
        value4 = value3;
        value3 = value2;
        value2 = value1;
        value1 = currentValue;
        
        return new double[]{value1, value2, value3, value4, value5}; // returns an array of the last 5 values, with the current value added to the front and the oldest value removed from the back
    }

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double deadband(double value, double deadband) {
        if (Math.abs(value) <= deadband) {
            return 0.0;
        }

        return value;
    }

    public static double removeDeadband(double value, double deadband) { // allow P controller to slowly ramp down or up to a deadband about instead of skiping to deadband to prevent edge discontinuity
    if (Math.abs(value) <= deadband) {
        return 0.0;
    }

    return Math.copySign(Math.abs(value) - deadband, value);
}

    public static double squareInput(double value) {
        return Math.copySign(value * value, value);
    }
}