package org.oop;

public class DistanceAndDirectionCalculator {

    private double xDistance;
    private double yDistance;

    public DistanceAndDirectionCalculator(double[] point1,double[] point2){
        this.xDistance = point2[0]-point1[0];
        this.yDistance = point2[1]-point1[1];
    }

    public double distance() {
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction() {
        return Math.atan2(yDistance, xDistance);
    }
}
