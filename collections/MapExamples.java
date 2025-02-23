package collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Person> phoneBook = new HashMap<>();

        Person ivan = new Person("342342424", "Ivan Ivanov");

        phoneBook.put("Zhu", new Person("00888888888", "Zhulian Iliev"));
        phoneBook.put("Emel", new Person("0999999999", "Emel Veli"));
        phoneBook.put("Boyana", new Person("0777777777", "Boyana Stoilova"));
        phoneBook.put("Niki", new Person("066666666", "Nikolay Gerasimov"));
        phoneBook.put("Vankata", ivan);

        Set<String> allKeys = phoneBook.keySet();

        for (String curKey : allKeys) {
            System.out.println(curKey);
        }

        Collection<Person> allValues = phoneBook.values();

        for (Person curPerson : allValues) {
            System.out.println(curPerson);
        }

        Set<Map.Entry<String, Person>> allEntries = phoneBook.entrySet();
        for (Map.Entry<String, Person> currentEntry : allEntries) {
            System.out.println("Key: " + currentEntry.getKey() + " -> " + currentEntry.getValue());
        }

    }
}
