package Day10.groupwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;



public class ProductMain {

    public static final String PRODUCT_RECOURCE = "src/main/resources/products.txt";
    static final DecimalFormat round = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException {

         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date currentDate = new Date();
        Product[] products = new Product[5];
        //   Product product = new Product("Pienas", "Zemaitija");
        //  products[0] = product;
        //    System.out.println(Arrays.toString(products));

        FileReader fileReader = new FileReader(PRODUCT_RECOURCE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readedLine = bufferedReader.readLine();

        //  String[] splitString = line.split(","); //isskaido duota eilute per i tiek segmentu, kiek randa kableliu.
        int i = 0;
        while (readedLine != null) {

            String[] pasplitintiDuomenys = readedLine.split(",");
            //   System.out.println(Arrays.toString(pasplitintiDuomenys));

            String name = pasplitintiDuomenys[0];
            String manufacturer = pasplitintiDuomenys[1];
            Double price = Double.valueOf(pasplitintiDuomenys[2]);
            Product product = new Product(name, manufacturer, price);
            products[i++] = product;
            readedLine = bufferedReader.readLine();
        }
        double sum = 0;
        for (Product product : products) {
            System.out.println(product);
            sum += product.price;

        }
        System.out.printf("Bendra suma " + round.format(sum) + "  € " );
        System.out.println();

        System.out.println(dateFormat.format(currentDate));

    }
}
