package lesson04;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Homework5StudentsGroup {

    String groupSubject;
    Homework4Student[] students;  //array
    int freePlaces;

    Homework5StudentsGroup(){
        this.freePlaces = 5;
        this.students  = new Homework4Student[5];
    }
    Homework5StudentsGroup(String groupSubject){
        this();
        this.groupSubject = groupSubject;
    }

    void addStudent(Homework4Student s){
        for (int i= 0; i < this.students.length; i++){
            if ((this.students[i] == null) && (this.freePlaces >= 1) && (s.subject.equals(this.groupSubject))) {
                this.students[i] = s;
                this.freePlaces -= 1;
                System.out.println("The student "+ this.students[i].name + " has been added to group!");
                return; //прекъсва цикъла в метод
            }
        }
    }

    void emptyGroup(){
        for (int i= 0; i < this.students.length; i++){
            if (this.students[i] != null) {
                this.students[i] = null;
            }
            this.freePlaces = 5;
        }
        System.out.println("The group is empty now!");
    }

    double theBestStudent(){
        double bestAssessment = 0;
        for (int i= 0; i < this.students.length; i++){
            if (this.students[i] != null){
                if (this.students[i].grade > bestAssessment) {
                    bestAssessment = this.students[i].grade;
                } this.freePlaces = 5;
            }
        }
        if (bestAssessment == 0){
            System.out.println("There is no best assessment. The group is empty!");
        }
        return bestAssessment;
    }

    void printStudentsInGroup(){
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                System.out.println(this.students[i]);
            }
        }
        System.out.println("The print group is empty!");

    }

}
