package lesson04;

public class Homework4Student {

    double grade;
    int yearInCollege;
    boolean isDegree;
    double money;
    String name;
    String subject;
    int age;

    //конструктори
    Homework4Student(){
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0.0;
    }

    Homework4Student(String name, String subject, int age){
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    //Ако искам да създам инстанция с различни от дефолтите ст-ти пр. Homework4Student one = new Homework4Student(5.00, 2, false, 1000, "Ivan", "Math", 29 )
    //трябва да има долния конструктур нали, не можах да го направя без него, вероятно заради бр.подавани п-ри?
    Homework4Student(double grade, int yearInCollege,  boolean isDegree, double money, String name, String subject, int age){
        this();
        this.grade = grade;
        this.yearInCollege = yearInCollege;
        this.isDegree = isDegree;
        this.money = money;
        this.name = name;
        this.subject = subject;
        this.age = age;
    }


    //намерих го в нета за принтиране на всички с-я на обект. Има ли по-лесен начин за това?
    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + " subject=" + subject + " money=" + money + " isDegree=" + isDegree + " grade=" + grade + " yearInCollege=" + yearInCollege + " }";
    }


    void upYear(){
        if ((!isDegree) && (this.yearInCollege < 4)){
            this.yearInCollege += 1;
            if (this.yearInCollege == 4){
                this.isDegree = true;
                System.out.println("The student "+ this.name + " is going to graduate this year");
            }
        } else{
            System.out.println("The student "+ this.name + " has already graduated!");
        }

    }

    //добавих и да не е завършил
    double receiveScholarship(double min, double amount){
        if ((this.grade >= min) && (this.age < 30) && (!isDegree)){
            this.money += amount;
            System.out.println("The student "+ this.name + " has received a scholarship of " + amount + ". Total money: " + money);
        } else{
            System.out.println("The student "+ this.name + " hasn't received a scholarship. Total money remain the same: " + money);
        }
        return this.money;
    }

}
