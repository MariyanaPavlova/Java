package homework6;

import java.sql.SQLOutput;

public class Student extends Person {
    double score;


    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        setScore(score);
    }

    // Setter
    public void setScore(double score) {
        if (score >= 2 && score <= 6) {
            this.score = score;
        } else {
            System.out.println("Score must be between 2 and 6");
        }
    }



    void showStudentInfo(){
        super.showPersonInfo();
        System.out.println("Student info: score: " + this.score);
    }

}
