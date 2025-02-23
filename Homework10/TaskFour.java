package Homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFour {
    @Override
    public String toString() {
        return "TaskFour{}";
    }

    public static void main(String[] args) {


        List<Double> number1 = new ArrayList<>(10);

        for (int i=1; i<=10; i++) { //от 1 за да няма стойност 0 на индекс 0
            double n;
            n = i * 3;
            number1.add(n);
        }
        System.out.println(number1.toString());
    }
}
