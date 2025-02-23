package inclass;

public class Computer {
    int manufactureYear;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;


    void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
    }


    void useMemory(double memory){
        if (hardDiskMemory - memory >= 0){
            hardDiskMemory -= memory;
        }else{
            System.out.println("Not enough free memory!");
        }
    }




}
