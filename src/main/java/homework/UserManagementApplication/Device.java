package homework.UserManagementApplication;

public class Device {
    String type;
    String model;
    int yearsMade;
    double price;

    @Override
    public String toString() {
        return
               type + "/" +
                model + "/"
              + yearsMade +"/"
             + price
              ;
    }

    public Device(String type, String model, int yearsMade, double price) {
        this.type = type;
        this.model = model;
        this.yearsMade = yearsMade;
        this.price = price;


    }
}
