package exercise03.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRegistry {
    private final Map<String, List<Double>> student = new HashMap<>();

    public void addGrade(String student, Double grade) {
        if (!this.student.containsKey(student)) {
            List<Double> grades = new ArrayList<>();
            grades.add(grade);
            this.student.put(student, grades);
            return;
        }
        List<Double> existingGrades = this.student.get(student);
        existingGrades.add(grade);
    }

    public void showStudentGrade(String student) {
        nullStudent(student);
        List<Double> grades = this.student.get(student);
        System.out.println("Aluno: " + student + " --- " + "Notas: " + grades);
    }

    public void calculateMedia(String student) {
        nullStudent(student);
        List<Double> grades = this.student.get(student);

        if (grades.isEmpty()) {
            System.out.println("O aluno não possui nenhuma nota");
            return;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double finalMedia = sum / grades.size();
        System.out.println("A média de " + student + " é: " + finalMedia);

    }

    private void nullStudent(String student) {
        if (!this.student.containsKey(student)) {
            System.out.println("Aluno não encontrado");
        }
    }
}