package homework.invidual;

import java.util.Scanner;

public class Mechanikas {
    String name;
    int age;
    int experienceLevel;
    boolean isDrunk;
    int priceOfWork=0;
    Scanner scanner = new Scanner(System.in);


    void repairCar(Car car) {

        if (car.isScratched) {
            System.out.println("Do you want original paint or cheaper?");
            String answer = scanner.next();
            if(answer.equals("original")){

                System.out.println("It will cost you around 500$");
                 car.isScratched=false;
            }else{
                System.out.println("It will cost you around 350$");
                car.isScratched=false;
            } }else{
                System.out.println("I dont think there is a need to repaint your car ");
            }

            }








    public Mechanikas(String name, int age, int experienceLevel, boolean isDrunk) {
        this.name = name;
        this.age = age;
        this.experienceLevel = experienceLevel;
        this.isDrunk = isDrunk;
    }
}
