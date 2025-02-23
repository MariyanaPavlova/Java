package lesson04;

import java.util.Arrays;

public class Homework5College {
    public static void main(String[] args) {

        Homework4Student one = new Homework4Student(5.00, 2, false, 1000, "George", "Math", 29 );
        Homework4Student two = new Homework4Student("Gosho", "Computer Science", 20);
        Homework4Student three = new Homework4Student("Pencho", "Literatura", 23 );
        Homework4Student four = new Homework4Student(4.50, 4, true, 1200, "Penka", "Science", 25 );
        Homework4Student five = new Homework4Student(3.00, 1, false, 100, "George2", "Math", 22 );
        Homework4Student six = new Homework4Student(4.00, 1, false, 100, "George3", "Math", 22 );
        Homework4Student seven = new Homework4Student(4.50, 1, false, 100, "George4", "Math", 22 );
        Homework4Student eight = new Homework4Student(6.00, 1, false, 100, "George5", "Math", 22 );
        Homework4Student nine = new Homework4Student(4.70, 1, false, 100, "George6", "Math", 22 );

        Homework5StudentsGroup groupOne = new Homework5StudentsGroup("Math");
        Homework5StudentsGroup groupTwo = new Homework5StudentsGroup("Computer Science");



        System.out.println("=======");
        System.out.println(one.toString());
        one.upYear();
        System.out.println(one.toString()); //2+1 = 3
        System.out.println("=======");

        four.upYear();
        System.out.println(four.toString()); // 4 +1 =  isDegree=true
        System.out.println("=======");

        one.receiveScholarship(4.50, 200); // под 30год взима стип.
        System.out.println("One: " + one.money); //1000 + 200  1200
        System.out.println("=======");

        groupOne.addStudent(one);
        System.out.println(Arrays.toString(groupOne.students)); //[lesson04.Homework4Student@1d81eb93, null, null, null, null]
        groupOne.addStudent(two);
        System.out.println(Arrays.toString(groupOne.students)); // [] remain the same, student studying diff subject
        System.out.println("=======");

        groupOne.addStudent(five); // add Gorge2
        groupOne.addStudent(six); // add George3
        groupOne.addStudent(seven); // add George4
        groupOne.addStudent(eight); //// add George5
        groupOne.addStudent(nine); // []is already full
        System.out.println(Arrays.toString(groupOne.students));
        System.out.println("=======");

        System.out.println("=======");
        groupOne.emptyGroup();

        groupOne.theBestStudent();


        System.out.println("=======");
        groupOne.emptyGroup();
        System.out.println(Arrays.toString(groupOne.students));


        System.out.println("=======");
        groupOne.printStudentsInGroup();

        System.out.println("=======");
        System.out.println(Arrays.toString(groupOne.students));
        groupOne.printStudentsInGroup();

        groupOne.theBestStudent();
        System.out.println(Arrays.toString(groupOne.students));


    }
}
