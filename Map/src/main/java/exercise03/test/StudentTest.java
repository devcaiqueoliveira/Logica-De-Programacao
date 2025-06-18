package exercise03.test;

import exercise03.domain.StudentRegistry;

public class StudentTest {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.showStudentGrade("Kassio");
        studentRegistry.addGrade("Kassio", 10.0);
        studentRegistry.addGrade("Kassio", 20.0);
        studentRegistry.showStudentGrade("Kassio");
        studentRegistry.calculateMedia("Kassio");
        studentRegistry.showStudentGrade("Kassio");
    }
}