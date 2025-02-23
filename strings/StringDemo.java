package strings;

public class StringDemo {

    public static void main(String[] args) {
        String firstName = "Borislav";
        String lastName = "Hristov";

        String fullName = "Borislav Hristov";
        String anotherFullName = "Borislav Hristov";

        String createdFullName = firstName + " " + lastName;

        if(fullName.equals(anotherFullName)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }

        if(fullName.equals(createdFullName)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }

        //THIS COMPARES THE references, NOT the exact values of the string characters
        if(fullName == anotherFullName) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }

        //THIS COMPARES THE references, NOT the exact values of the string characters
        if(fullName == createdFullName) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }


    }

}
