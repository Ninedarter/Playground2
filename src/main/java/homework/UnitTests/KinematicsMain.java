package homework.UnitTests;

public class KinematicsMain {
    public static void main(String[] args) {
        KinematicsService kinematicsService = new KinematicsService();
        float  pagreitis = kinematicsService.apskaiciuotiPagreiti(10, 0, 5);
        boolean arGreiteja;
        boolean arLeteja;
        boolean arStoviVietoje;
        if (pagreitis > 0) {
            arGreiteja = true;
            System.out.println("Objektas greiteja pagreiciu " + pagreitis);
        } else if (pagreitis < 0) {
            arLeteja = true;
            System.out.println("Objektas leteja pagreiciu " + pagreitis);
        } else {
            arStoviVietoje = true;
            System.out.println("Objektas stovi vietoje");
        }

    }


}
