package day9_1022.Strings.Groupwork;

public class CountryService {

    public void printCountriesStartingWithT(String[] countries) {
        int counter = 0;
        for (String singleCountry : countries) {

            if (singleCountry.startsWith("T")) {
                counter ++;
                System.out.println(singleCountry);
            }
            if (counter != 0){
                System.out.println("Ne viena salis neprasiseda is T raides");
            }



        }


    }

    public void printCountriesEndingWithJa(String[] countries) {


        for (String singleCountry : countries) {

            if (singleCountry.endsWith("JA")) {

                System.out.println(singleCountry);
            }


        }
        System.out.println("Ne viena salis neprasiseda is T raides");


    }


    public void printCountriesNameLongerThan5(String[] countries) {
        for (String singleountry : countries) {

            if (singleountry.length() > 5) {
                System.out.println("Ilgesniu nei 5 raidės saliu pavadinimai yra : ");
                System.out.println(singleountry);
            }

        }
        System.out.println("Nėra salies ilgesnes nei 5 raides");

    }


    public void printCountriesWithoutFirstLetter(String[] countries) {


        for (String singleCountry : countries) {

            System.out.println(singleCountry.substring(1));

        }

    }


    public void letterCounter(String[] countries) {
        int totalLetters = 0;
        for (String singleCountry : countries) {


            totalLetters = singleCountry.length() + totalLetters;
            System.out.println();

        }

    }

    public void countriesLenghtSort(String[] countries) {
        int lenght = 0;
        for (String singleCountry : countries) {
            lenght = singleCountry.length();


        }


    }
}
