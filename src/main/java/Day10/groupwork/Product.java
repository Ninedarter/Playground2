package Day10.groupwork;

public class Product {
    String name;
    String manufacturer;
    Double price;

    public Product(String name, String manufacturer, Double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
