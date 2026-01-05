package com.student.management;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Management System Started\n");

        // Create a student
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Alice", 22);

        System.out.println("Student 1: " + student1.getName() + ", Age: " + student1.getAge());
        System.out.println("Student 2: " + student2.getName() + ", Age: " + student2.getAge());

        // GradeCalculator example
        GradeCalculator calculator = new GradeCalculator();
        int[] gradesJohn = {85, 90, 78};
        int[] gradesAlice = {92, 88, 95};

        System.out.print("\nJohn's ");
        calculator.printAverage(gradesJohn);

        System.out.print("Alice's ");
        calculator.printAverage(gradesAlice);
    }
}
