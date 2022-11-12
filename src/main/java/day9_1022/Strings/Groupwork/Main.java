package day9_1022.Strings.Groupwork;

public class Main {

    public static void main(String[] args) {

        String[] countries = new String[10];
        countries[0] = "Lietuva";
        countries[1] = "Norvegija";
        countries[2] = "Tunisas";
        countries[3] = "Surinamis";
        countries[4] = "Gana";
        countries[5] = "Kinija";
        countries[6] = "Anglija";
        countries[7] = "Airija";
        countries[8] = "Tasmanija";
        countries[9] = "Bosnija ir Hercogovina";

        CountryService countryService = new CountryService();
        countryService.printCountriesStartingWithT(countries);
        countryService.printCountriesEndingWithJa(countries);
        countryService.printCountriesNameLongerThan5(countries);
        countryService.printCountriesWithoutFirstLetter(countries);

    }


}
