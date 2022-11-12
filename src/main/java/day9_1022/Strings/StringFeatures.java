package day9_1022.Strings;

import java.util.Arrays;

public class StringFeatures {
    public static void main(String[] args) {

        String phrase = "Today is Saturday!";
        char drivingCategory = 'B';

        //toCharArray Grazina simboliu masyva(pavercia stringa i simboliu masyva)
        char[] raides = phrase.toCharArray();
        System.out.println(Arrays.toString(raides));
        System.out.println(phrase.charAt(2));

        for (char vienaRaide : raides) {
            System.out.print(vienaRaide + "^");
        }
        System.out.println();
        System.out.println();
        if (phrase.length() > 10 ) {

            System.out.println(phrase  + " is longer than 10 symbols");

        } else {
            System.out.println(" short sentence ");
        }

        System.out.println("Sakinys  paverstas mazosiomis raidemis:    " + phrase.toLowerCase());
        
        String daiktas = "Computer";
        System.out.println(daiktas.contains("Comp"));
    }


}
