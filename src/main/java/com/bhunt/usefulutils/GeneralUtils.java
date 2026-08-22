package com.bhunt.usefulutils;

public final class GeneralUtils {

    private GeneralUtils() {}

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double deadband(double value, double deadband) {
        if (Math.abs(value) < deadband) {
            return 0.0;
        }

        return value;
    }

    public static double squareInput(double value) {
        return Math.copySign(value * value, value);
    }
}