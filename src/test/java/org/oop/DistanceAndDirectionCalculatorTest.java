package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        double[] origin ={0,0};
        DistanceAndDirectionCalculator calculate = new DistanceAndDirectionCalculator(origin,origin);
        Assertions.assertEquals(0, calculate.distance());
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        double[] origin = {0,0};
        double[] point1 = {1,0};
        double[] point2 = {0,1};

        DistanceAndDirectionCalculator calculate1 = new DistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator calculate2 = new DistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(1, calculate1.distance());
        Assertions.assertEquals(1, calculate2.distance());
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        double[] from = {1,0};
        double[] to = {-1,0};
        DistanceAndDirectionCalculator calculate = new DistanceAndDirectionCalculator(from,to);

        Assertions.assertEquals(2, calculate.distance());
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        double[] origin = {0,0};
        double[] point1 = {1,0};
        double[] point2 = {3,0};

        DistanceAndDirectionCalculator calculate1 = new DistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator calculate2 = new DistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(0, calculate1.direction());
        Assertions.assertEquals(0, calculate2.direction());
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {

        double[] origin = {0,0};
        double[] point1 = {-1,0};
        double[] point2 = {-3,0};

        DistanceAndDirectionCalculator calculate1 = new DistanceAndDirectionCalculator(origin,point1);
        DistanceAndDirectionCalculator calculate2 = new DistanceAndDirectionCalculator(origin,point2);

        Assertions.assertEquals(Math.PI, calculate1.direction());
        Assertions.assertEquals(Math.PI, calculate2.direction());
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {

        double[] origin = {0,0};
        double[] point1 = {0,1};
        double[] point2 = {0,3};

        DistanceAndDirectionCalculator calculate1 = new DistanceAndDirectionCalculator(origin,point2);
        DistanceAndDirectionCalculator calculate2 = new DistanceAndDirectionCalculator(origin,point1);

        Assertions.assertEquals(Math.PI / 2, calculate1.direction());
        Assertions.assertEquals(Math.PI / 2, calculate2.direction());
    }
}
