package homework.invidual;

public class Main {
    public static void main(String[] args) {

        Mechanikas petras  = new Mechanikas("Petras",25,4, false);
        Car volvo = new Car("Volvo", true, 2022);

            petras.repairCar(volvo);
            petras.repairCar(volvo);
    }
}
