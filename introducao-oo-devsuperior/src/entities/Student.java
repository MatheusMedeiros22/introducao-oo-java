package entities;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;

    public List<Double> grades = new ArrayList<>(); //inicializar um array com 3 posiçoes

    public double finalGrade(){
        double finalGrade = 0.0;

        for (Double grade: grades ) {
            finalGrade += grade;
        }

        return finalGrade;
    }

    public String studentSituation(){
        double grade = finalGrade();
        if(grade > 60.0){
            return "PASS";
        }else{
            return "FAILED ->" +
                    "MISSING " +
                    (60 - grade) +
                    " POINTS";
        }
    }
}
