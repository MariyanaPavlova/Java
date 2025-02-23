package lesson04;

public class Homework4StudentDemo {

    public static void main(String[] args) {

        Homework4Student one = new Homework4Student(5.00, 2, false, 1000, "ScholarshipOne", "Math", 29 );
        Homework4Student two = new Homework4Student("ScholarshipDef1", "Computer Science", 20);
        Homework4Student three = new Homework4Student("ScholarshipDef2", "Literatura", 23 );
        Homework4Student four = new Homework4Student(4.50, 4, true, 1000, "Four", "Science", 25 );
        Homework4Student five = new Homework4Student(4.50, 4, true, 1000, "NoScholarship30", "Science", 30 );
        Homework4Student six = new Homework4Student(3.00, 4, true, 1000, "NoScholarship3.00", "Science", 20 );

        //тест дали работят дефолтните ст-ти
        //        this.grade = 4.0;
        //        this.yearInCollege = 1;
        //        this.isDegree = false;
        //        this.money = 0.0;
        System.out.println("=======");
        System.out.println(two.grade);
        System.out.println(two.yearInCollege);
        System.out.println(two.isDegree);
        System.out.println(two.money);
        System.out.println("=======");

        System.out.println(one.toString());
        one.upYear();
        System.out.println("one: yearInCollege " + one.yearInCollege); // year 2+1 = 3 isDegree=false
        System.out.println("one: isDegree " + one.isDegree); //false
        System.out.println("=======");

        System.out.println(two.toString());
        two.upYear();
        System.out.println("two: yearInCollege " + two.yearInCollege); // year 1+1 = 2 isDegree=false
        System.out.println("two: isDegree " + two.isDegree); //false
        System.out.println("=======");

        System.out.println(four.toString());
        four.upYear();
        System.out.println("four: yearInCollege" + four.yearInCollege); //graduated, year remain the same 4, isDegree=true Завършва
        System.out.println("four: isDegree" + four.isDegree); //true
        System.out.println("=======");

        one.receiveScholarship(4.50, 200); //1000 + 200 = 1200 isDegree=false
        one.receiveScholarship(4.50, 200); //1200 + 200 = 1400 isDegree=false
        System.out.println("one: money " + one.money);
        four.receiveScholarship(4.00, 300); //1000+300 = 1500 isDegree=true Завърших го горе
        two.receiveScholarship(4.00, 200); // 0 +200 = 200 isDegree=false
        five.receiveScholarship(4.50, 300); //не взима стип. 30  isDegree=false
        six.receiveScholarship(4.00, 300); //не взима стип. успех 3 под мин 4,00 isDegree=false


    }


}
