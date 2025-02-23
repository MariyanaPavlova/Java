package inclass;

public class Homework4Computer {
    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    // домашно 4 зад 1
    Homework4Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    // домашно 4 зад 1
    Homework4Computer(int year, double price, double hardDiskMemory, double freeMemory){
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    // домашно 4 зад 1
    Homework4Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }


    // домашно 4 зад 1
    int comparePrice(Homework4Computer otherComputer) {
        int returnValue = 0;
        if (this.price > otherComputer.price){
            //System.out.println("The computer with price: " + this.price + " comp is more expensive than" + otherComputer.price);
            returnValue =  -1;
        } else if (this.price < otherComputer.price)  {
            //System.out.println("The computer with price: " + this.price + " comp is less expensive than" + otherComputer.price);
            returnValue =  1;
        } else if (this.price == otherComputer.price) {
            //System.out.println("The computer with price: " + otherComputer.price + "is equal to" + this.price);
            returnValue = 0;
        }
        return returnValue;
    }

    // домашно 4 зад 1
    void printMessageComparePrice(Homework4Computer otherComputer, int comparePrice) {
        if (comparePrice == -1){
            System.out.println("The computer with price: " + this.price + " is more expensive than " + "computer with price: " + otherComputer.price);
        } else if (comparePrice == 1){
            System.out.println("The computer with price: " + this.price + " is less expensive than " + "computer with price: " + otherComputer.price);
        } else if (comparePrice == 0) {
            System.out.println("The computer with price: " + this.price + " is equal to " +  "computer with price: " + otherComputer.price);
        }
    }

    // домашно 3
//    void changeOperationSystem(String newOperationSystem){
//        operationSystem = newOperationSystem;
//    }
//
//
//    void useMemory(double memory){
//        if (memory < freeMemory) {
//            freeMemory -= memory;
//        }else{
//            System.out.println("Not enough free memory!");
//        }
//    }

}
