package homework6;

public class Employee extends Person{
    protected double daySalary;


    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;

    }

    double calculateOvertime(double hours){
        if (this.age() < 18) {
            return 0;
        }
        return (this.daySalary/8) * 1.5 * hours;
    }

    void showEmployeeInfo(){
        super.showPersonInfo();
        System.out.println("Employee info: daySalary: " + this.daySalary);
    }


}
