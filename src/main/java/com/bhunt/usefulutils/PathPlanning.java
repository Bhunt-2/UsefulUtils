// h = height of the triangle
// b = length of the base of the triangle
// A = left angle of the triangle
// B = right angle of the triangle

// h = b * sin(A) * sin(B) / sin(A+B)


//webcam FOV 80 degrees
// object detection returns the position of the object in relation to the top left corner of the webcam FOV, in pixels. 
// angle = (position / webcamFOV) * 80

package com.bhunt.usefulutils;



public final class PathPlanning {

    private PathPlanning() {}

    public static double getSinglePointAngle(double xOffset, double webcamFOV, double webcamWidth) { // returns the angle of a point in relation to the center of the webcam FOV, given its x offset in pixels, the webcam FOV in degrees, and the webcam width in pixels

        double angle = ((xOffset / webcamWidth) * webcamFOV)
             - (0.5 * webcamFOV);


        return angle;// returns the angle of the point in relation to the center of the webcam FOV, in degrees
    }

    public static double[] getDualPointAngle(double xOffset1, double xOffset2, double webcamFOV, double webcamWidth) { // returns the angles of two points in relation to the center of the webcam FOV, given their x offsets in pixels, the webcam FOV in degrees, and the webcam width in pixels
    double angle1 = ((xOffset1 / webcamWidth) * webcamFOV)
             - (0.5 * webcamFOV);

    double angle2 = ((xOffset2 / webcamWidth) * webcamFOV)
             - (0.5 * webcamFOV);

    return new double[] { angle1, angle2 };// returns the angles of the two points in relation to the center of the webcam FOV, in degrees
}


    public static double calculateTriangleHeight(double baseLength, double leftAngle, double rightAngle) { //returns the height of a triangle given the base length and the two angles adjacent to the base
        
        double leftAngleRad = Math.toRadians(leftAngle);
        double rightAngleRad = Math.toRadians(rightAngle);

        double triangleHeight = baseLength * Math.sin(leftAngleRad) * Math.sin(rightAngleRad) / Math.sin(leftAngleRad + rightAngleRad);
        return triangleHeight; // unit = same as baseLength
    }

    public static double getRobot2Speed(double robot2Distance, double time) {
        double robotSpeed = robot2Distance / time; // unit = same as robot2Distance / time
        return robotSpeed;
    }

    public static double calculateInterceptPoint(double PLACEHOLDER) {
        return PLACEHOLDER;
    }


}
