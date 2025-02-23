package inclass;

public class ComputerDemo {

    public static void main(String[] args){
        Computer laptop = new Computer();
        laptop.manufactureYear = 2024;
        laptop.price = 2100;
        laptop.hardDiskMemory = 256;
        laptop.freeMemory = 16;
        laptop.operationSystem = "Microsoft Windows";


        Computer stationary = new Computer();
        stationary.manufactureYear = 2023;
        stationary.price = 1800;
        stationary.hardDiskMemory = 512;
        stationary.freeMemory = 32;
        stationary.operationSystem = "Linux";


        laptop.changeOperationSystem("Linux");
        stationary.useMemory(100);

        System.out.println("Laptop manufacture year is: " + laptop.manufactureYear);
        System.out.println("Laptop price is: " + laptop.price);
        System.out.println("Laptop hard disk memory is: " + laptop.hardDiskMemory);
        System.out.println("Laptop free memory is: " + laptop.freeMemory);
        System.out.println("Laptop operation system is: " + laptop.operationSystem);

        System.out.println("Stationary manufacture year is: "+ stationary.manufactureYear);
        System.out.println("Stationary price is: " + stationary.price);
        System.out.println("Stationary hard disk memory is: " + stationary.hardDiskMemory);
        System.out.println("Stationary free memory is: " + stationary.freeMemory);
        System.out.println("Stationary operation system is: " + stationary.operationSystem);
    }

}
