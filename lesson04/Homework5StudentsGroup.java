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

    // Milen decision
//    void addStudent(Student s) {
//        if(!s.subject.equals(this.subject)) {
//            System.out.println(s.name +" has different subject!");
//            return;
//        }
//        if(freePlaces == 0) {
//            System.out.println("Sorry, there is not free place");
//            return;
//        }
//
//        students[students.length - freePlaces] = s;
//        freePlaces --;
//    }

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
        //freePlaces = 5; Milen decision
        //students = new Student[5]; Milen decision

        for (int i= 0; i < this.students.length; i++){
            if (this.students[i] != null) {
                this.students[i] = null;
            }
            this.freePlaces = 5;
        }
        System.out.println("The group is empty now!");
    }

    double theBestStudent(){
        // be careful of the group have students  Milen decision
//        Student bestStudent = students[0];
//
//        for (int i = 1; i < students.length - freePlaces; i++) {
//            if(students[i].grade > bestStudent.grade) {
//                bestStudent = students[i];
//            }
//        }
//        return bestStudent.name;

        double bestAssessment = 0;
        for (int i= 0; i < this.students.length; i++){
            if (this.students[i] != null){
                if (this.students[i].grade > bestAssessment) {
                    bestAssessment = this.students[i].grade;
                }
            }
        }
        if (bestAssessment == 0){
            System.out.println("There is no best assessment. The group is empty!");
        }
        return bestAssessment;
    }

    void printStudentsInGroup(){
//        for (int i = 0; i < students.length - freePlaces; i++) {
//            System.out.println("Name:" + students[i].name + " age: " + students[i].age );
//        }

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                System.out.println(this.students[i]);
            }
        }
        System.out.println("The print group is empty!");

    }

}
