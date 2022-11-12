package Day10.Recap;

public class Mechanikas {

    String vardas;
    int patirtisMetais;
    String servisas;
    double alga;

    public Mechanikas() {

        System.out.println("Iskviestas defaultinis konstruktorius");

    }
    // klasese aprasome metodo SIGNATURE
    public void eikPavalgyk(){
        System.out.println("Einu ir valgau");
    }

    public Cigarete duokParukyt () {
        System.out.println("Imk ir rukyk..");
        return new Cigarete("Bond");



    }

    public void taisykAutomobili(Masina masinaKuriaReikiaTaisyti){
        if (masinaKuriaReikiaTaisyti.isBroken){
            System.out.println("Taisau masina  " + masinaKuriaReikiaTaisyti.name);
            masinaKuriaReikiaTaisyti.isBroken = false;
        } else {
            System.out.println("Nera ko taisyti. Vaziuok is cia!");
        }


    }




    public Mechanikas(String vardas, int patirtisMetais, String servisas, double alga) {
        this.vardas = vardas;
        this.patirtisMetais = patirtisMetais;
        this.servisas = servisas;
        this.alga = alga;
    }

    @Override
    public String toString() {
        return String.format("Mechanikas vardu %s, jis dirba servise %s, jo patirtis %d, jis uzdirba %f euru.",
                vardas,servisas,patirtisMetais,alga);
    }
}
