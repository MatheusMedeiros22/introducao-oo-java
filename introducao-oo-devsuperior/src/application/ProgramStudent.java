package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        std.name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            std.grades.add(sc.nextDouble());
        }

        System.out.println("FINAL GRADE = " + std.finalGrade());
        System.out.println(std.studentSituation());
    }
}
