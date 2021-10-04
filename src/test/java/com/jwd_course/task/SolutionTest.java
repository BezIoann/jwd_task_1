package com.jwd_course.task;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest extends TestCase {

    public void testCalculateFunctionValues() {
        try {
            ArrayList<Double> actual = Solution.calculateFunctionValues(1,5,0.5);
            List<Double> expected = new ArrayList<>(
                    List.of(2.208, 2.987, 2.532, 1.23, 0.143, 0.03, 0.737, 1.419));
            Assert.assertEquals(expected, actual);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void testCalculateFunctionValues1() {
        try {
            ArrayList<Double> actual = Solution.calculateFunctionValues(1,100,2);
            List<Double> expected = new ArrayList<>(
                    List.of(2.208, 0.143, 1.354, 1.44, 0.67, 1.5, 0.691, 1.415, 1.362, 0.154, 2.186, 0.988,
                            -0.053, 2.77, 0.512, 0.082,
                            3.0, 0.11, 0.468, 2.808, -0.054, 0.946, 2.252, 0.12, 1.336, 1.49, 0.629,
                            1.499, 0.733, 1.366,
                            1.379, 0.179, 2.141, 1.016, -0.05, 2.742, 0.542, 0.065, 2.997,
                            0.13, 0.44, 2.832, -0.053, 0.916, 2.295, 0.099, 1.317, 1.539, 0.589, 1.497));
            Assert.assertEquals(expected, actual);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}