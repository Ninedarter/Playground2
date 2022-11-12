package homework.invidual;

public class Car {
    String brand;
    boolean isScratched;
    int yearMade;


    public Car(String brand, boolean isDamaged, int yearMade) {
        this.brand = brand;
        this.isScratched = isDamaged;
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", isDamaged=" + isScratched +
                ", yearMade=" + yearMade +
                '}';
    }
}
