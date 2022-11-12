package Day10.Recap;

public class GarazasMain {
    public static void main(String[] args) {

        Mechanikas mechanikas = new Mechanikas();
        mechanikas.vardas = "Tomas";
        mechanikas.alga = 2950;
        mechanikas.patirtisMetais = 5;
        mechanikas.servisas = "Autobroliai";
        System.out.println(mechanikas);
        mechanikas.eikPavalgyk();
        Cigarete cigariukasIsMechaniko = mechanikas.duokParukyt(); //grazina OBJEKTA todel mes JI TALPINAM I KINTAMAJI
        System.out.println("Va gavau cigarete " + cigariukasIsMechaniko.brand + "  is mecahniko  " + mechanikas.vardas);
        Masina volvo = new Masina("XC90", true);
        mechanikas.taisykAutomobili(volvo);

        Masina bmw = new Masina("BWM X5", true);
        Masina skoda = new Masina("Skoda fabia", false);
        Masina nissan = new Masina("Nissan Skyline Gt", true);
        Masina[] klientuAuto = {bmw, skoda, nissan};

        System.out.println(klientuAuto[2].name);
        System.out.println("____________________TAISOM MASINAS");
        for (Masina masinaEileje : klientuAuto) {
            mechanikas.taisykAutomobili(masinaEileje);
        }
    }
}

//KUO SKIRIASI VOID NUO RETURN TIPO