package com.jwd_course.task;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {


    public static ArrayList<Double> calculateFunctionValues(double a, double b, double h) throws Exception {
        ArrayList<Double> result = new ArrayList<>();
        double fx;
        if (a > b) {
            throw new Exception("The segment-start greater that segment-end!");
        }
        if (h < 0) {
            throw new Exception("Step should be positive number!!");
        }
        if (a == b) {
            throw new Exception("Segment is empty!");
        }

        for(double i=a; i<b; i+=h) {
            fx = Math.pow(2, Math.sin(i)) - Math.cos(2*i);
            result.add( Math.round(fx * 1000.0) / 1000.0);
        }

        return result;
    }

    public static void showFunctionValues(double a, double b, double h, ArrayList<Double> result) {
        int i = 0;
        System.out.println("Argument | Function Value");

        for(double x=a; x<=b; x+=h) {
            System.out.printf("%.2f      ", x);
            System.out.printf("%.2f\n", result.get(i));
            i++;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> result;

        System.out.println("Enter segment start: ");
        double a = scanner.nextDouble();

        System.out.println("Enter segment end: ");
        double b = scanner.nextDouble();

        System.out.println("Enter step: ");
        double h = scanner.nextDouble();

        try {
            result = calculateFunctionValues(a,b, h);
            showFunctionValues(a, b, h, result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
