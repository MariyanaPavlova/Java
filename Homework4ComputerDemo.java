package inclass;

public class Homework4ComputerDemo {

    public static void main(String[] args){
        //домашно 3
        Homework4Computer laptop = new Homework4Computer();
        laptop.year = 2024;
        laptop.price = 2100;
        laptop.hardDiskMemory = 256;
        laptop.freeMemory = 16;
        laptop.operationSystem = "Microsoft Windows";

        //домашно 3
        Homework4Computer stationary = new Homework4Computer();
        stationary.year = 2023;
        stationary.price = 1800;
        stationary.hardDiskMemory = 512;
        stationary.freeMemory = 32;
        stationary.operationSystem = "Linux";

        // домашно 4 зад 1
        Homework4Computer homeLaptop = new Homework4Computer();
        Homework4Computer homeLaptop2 = new Homework4Computer();
        Homework4Computer expensivePC = new Homework4Computer(2024, 4000.00, 256, 16 );
        Homework4Computer workLaptop = new Homework4Computer(2024, 3000.00, true, 256, 16, "Windows 10");

        // домашно 4 зад 1
        int comparison1 = workLaptop.comparePrice(expensivePC); //3000 < 4000
        workLaptop.printMessageComparePrice(expensivePC, comparison1 );

        int comparison2 = expensivePC.comparePrice(workLaptop); //4000 > 3000
        expensivePC.printMessageComparePrice(workLaptop, comparison2 );

        int comparison3 = homeLaptop.comparePrice(workLaptop);  //0 < 3000
        homeLaptop.printMessageComparePrice(workLaptop, comparison3 );

        int comparison4 = homeLaptop.comparePrice(homeLaptop2); //equal 0 = 0 default values
        homeLaptop.printMessageComparePrice(homeLaptop2, comparison4 );

        int comparison5 = laptop.comparePrice(stationary); //2100 > 1800 създадени от старото домашно
        laptop.printMessageComparePrice(stationary, comparison5);

        //домашно 3
//        laptop.changeOperationSystem("Linux");
//        stationary.useMemory(100);

//        System.out.println("Laptop manufacture year is: " + laptop.year);
//        System.out.println("Laptop price is: " + laptop.price);
//        System.out.println("Laptop hard disk memory is: " + laptop.hardDiskMemory);
//        System.out.println("Laptop free memory is: " + laptop.freeMemory);
//        System.out.println("Laptop operation system is: " + laptop.operationSystem);
//
//        System.out.println("Stationary manufacture year is: "+ stationary.year);
//        System.out.println("Stationary price is: " + stationary.price);
//        System.out.println("Stationary hard disk memory is: " + stationary.hardDiskMemory);
//        System.out.println("Stationary free memory is: " + stationary.freeMemory);
//        System.out.println("Stationary operation system is: " + stationary.operationSystem);
   }

}
