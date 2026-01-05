package com.student.management;

public class GradeCalculator {

    // Calculate average of student grades
    public double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? (double) sum / grades.length : 0;
    }

    public void printAverage(int[] grades) {
        System.out.println("Average grade: " + calculateAverage(grades));
    }
}
