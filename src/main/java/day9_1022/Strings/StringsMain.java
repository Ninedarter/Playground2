package day9_1022.Strings;

public class StringsMain {
    public static void main(String[] args) {
        
        /**
        * In Java Strings are treated as Objects
         *Also Strings (literals) in java are immutable
         * if we want to have mutable Strings, we use classes like SringBuffer or String builder
         *
        */

        String myName = "Tom"; // we create String Literal here. Using double quotes;
        String friendsName = "Tom"; // It will not create a new String in pool, it will reuse the same;
        String dadsName =  "Peter";

        // " ==" checks if those variables refer to the SAME OBJECT
        System.out.println(myName == friendsName);
        System.out.println(myName == dadsName);

        System.out.println("Values are equal " + myName.equals(friendsName));
        System.out.println("Values are equal " + myName.equals(dadsName));
        System.out.println("");


        String s1 = "Labas";
        String s2 = "Labas";
        String s3 = new String("Labas");
        String s4 = "Viso";

        //ar rodo i tapati String Literal "Labas"
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("test " == "test");
        System.out.println("test " == "te" + "st");

    }
}
