package collections;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Zhulian");
        names.add("Gabriela");
        names.add("Daniela");
        names.add("Petar");
        names.add("Petar");
        names.add("Petar");
        names.add("Aleksandar");
        names.add("Emel");
        names.add("Mariyana");
        names.add("Svetozara");

        for (String currentName : names) {
            System.out.println(currentName);
        }

        List<String> otherNames = new ArrayList<>();

        otherNames.add("Bojidar");
        otherNames.add("Petar");
        otherNames.add("Galia");
        otherNames.add("Boyana");
        otherNames.add("Nikolay");
        otherNames.add("Svetozara");

        for (String currentName : otherNames) {
            System.out.println(currentName);
        }

        names.addAll(otherNames);
        System.out.println("--------");
        for (String currentName : names) {
            System.out.println(currentName);
        }




    }
}
