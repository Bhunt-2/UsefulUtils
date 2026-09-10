// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.bhunt.usefulutils;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final class FuelConstants {
    // Motor controller IDs for Fuel Mechanism motors
    public static final int FEEDER_MOTOR_ID = 31;
    public static final int INTAKE_LAUNCHER_MOTOR_ID = 32;

    double widthWebcam = 720; // pixels
    double FOVwebcam = 80; // degrees
    double firstAngle = 100; // pixels
    double secondAngle = 200; // pixels

    double baseLength = 2; // feet

    double[] angles = PathPlanning.getDualPointAngle(firstAngle, secondAngle, FOVwebcam, widthWebcam);

    double robot2Distance = PathPlanning.calculateTriangleHeight(baseLength, angles[0], angles[1]);

    double time = System.currentTimeMillis() / 1000; // seconds


    // Current limit and nominal voltage for fuel mechanism motors.
    public static final int FEEDER_MOTOR_CURRENT_LIMIT = 39;// 40 amps - 1 amp for margin
    public static final int LAUNCHER_MOTOR_CURRENT_LIMIT = 39;// 40 amps - 1 amp for margin

    public static final double FEEDER_MAX_ACCELERATION = 1000; // rotations per second squared
    public static final double LAUNCHER_MAX_ACCELERATION = 1000; // rotations per second squared
    public static final double FEEDER_MAX_SPEED = 1000; // rotations per second
    public static final double LAUNCHER_MAX_SPEED = 1000; // rotations per second

    // Voltage values for various fuel operations. These values may need to be tuned
    // based on exact robot construction.
    // See the Software Guide for tuning information
    public static final double INTAKING_FEEDER_VOLTAGE = 12;
    public static final double INTAKING_INTAKE_VOLTAGE = 10;
    public static final double LAUNCHING_FEEDER_VOLTAGE = 9;
    public static final double LAUNCHING_LAUNCHER_VOLTAGE = 10.6;
    public static final double SPIN_UP_FEEDER_VOLTAGE = -6;
    public static final double SPIN_UP_SECONDS = 1;

    //intake RPM to intake fuel. This will need to be tuned.
    public static final double TUNE_FEEDER_INTAKE_RPM = 4150; // rpm for the feeder to intake fuel (8.4:1 ratio between motor and feeder, KrakenX60 has 6000 RPM max speed)
    public static final double TUNE_LAUNCHER_INTAKE_RPM = 5000; // rpm for the launcher to intake fuel (1:1 ratio between motor and launcher, KrakenX60 has 6000 RPM max speed)

    // Lower RPM to reduce prep time while not drawing too much current. This will need to be tuned.
    public static final double TUNE_FEEDER_SPIN_UP_RPM = 1700; // motor rotations per minute (8.4:1 ratio between motor and feeder, KrakenX60 has 6000 RPM max speed)
    public static final double TUNE_LAUNCHER_SPIN_UP_RPM = 3000; // motor rotations per minute (1:1 ratio between motor and launcher, KrakenX60 has 6000 RPM max speed) 

    // RPM to launch the fuel. This will need to be tuned.
    public static final double TUNE_FEEDER_LAUNCH_RPM = 4150; // rpm for the feeder to launch fuel (8.4:1 ratio between motor and feeder, KrakenX60 has 6000 RPM max speed)
    public static final double TUNE_LAUNCHER_LAUNCH_RPM = 5000; // rpm for the launcher to launch fuel (1:1 ratio between motor and launcher, KrakenX60 has 6000 RPM max speed)

    //compatiblity allias
    public static final double FEEDER_INTAKE_RPM = TUNE_FEEDER_INTAKE_RPM;
    public static final double LAUNCHER_INTAKE_RPM = TUNE_LAUNCHER_INTAKE_RPM;

    public static final double FEEDER_SPIN_UP_RPM = TUNE_FEEDER_SPIN_UP_RPM; 
    public static final double LAUNCHER_SPIN_UP_RPM = TUNE_LAUNCHER_SPIN_UP_RPM;

    public static final double FEEDER_LAUNCH_RPM = TUNE_FEEDER_LAUNCH_RPM; 
    public static final double LAUNCHER_LAUNCH_RPM = TUNE_LAUNCHER_LAUNCH_RPM;

  }

  public static final class OperatorConstants {
    // Port constants for driver and operator controllers. These should match the
    // values in the Joystick tab of the Driver Station software
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int OPERATOR_CONTROLLER_PORT = 1;
  }
}
