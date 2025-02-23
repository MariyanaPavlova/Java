package homework6;

public class Demo {
    public static void main(String[] args) {
        Person [] people = new Person[10];

        Person person1 = new Person("person1", 17, true);
        people[0] = person1;
        person1.showPersonInfo();
        Person person2 = new Person("person2", 50, false);
        people[1] = person2;
        Student student1 = new Student("student1", 21, true, 4.50);
        people[3] = student1;
        Student student2 = new Student("student2", 21, false, 5.50);
        people[4] = student2;
        Student student3 = new Student("student3", 24, false, 10); //Score must be between 2 and 6


        Employee employee1 = new Employee("employee1", 40, true, 200);
        people[5] = employee1;
        employee1.showEmployeeInfo();
        employee1.calculateOvertime(2);
        System.out.println(employee1.calculateOvertime(2));
        Employee employee2 = new Employee("employee2", 60, false, 100);
        people[6] = employee2;

        for (Object i: people){
            if (i != null) {
                if (i instanceof Student) {
                    ((Student) i).showStudentInfo();

                } else if (i instanceof Employee) {
                    ((Employee) i).showEmployeeInfo();
                } else {
                    ((Person) i).showPersonInfo();
                }//ако в if-a най-отгоре сложа Person -не слиза на долу, извърта всички в него, а така работи защо?
            }
        }

        for (Object i: people){
            if (i instanceof Employee){
                double overtimePay  =((Employee) i).calculateOvertime(2);{
                    System.out.println(overtimePay);
                }
            }
        }
    }

}
