package Day10.FileReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingMain {
    public static final String PATH_TO_FILE = "src/main/resources/countries.txt";

    public static void main(String[] args) throws IOException {
        FileReader failuSkaitytojas = new FileReader(PATH_TO_FILE);   //desini peles mygtuka ant countries.txt --> copyPath->copyPath from root
        BufferedReader bufferedReader = new BufferedReader(failuSkaitytojas);
        //nuskaitau pirma eilute,kad ir kokia ji bebutu
        String nuskaitytaEilute = bufferedReader.readLine(); // nuskaicius
        System.out.println(nuskaitytaEilute);
        String nuskaitytaEilute2 = bufferedReader.readLine();
        System.out.println(nuskaitytaEilute2);

if (nuskaitytaEilute == null) {

    System.out.println("Nera irasu faile");

}
        //ciklo salyga - veik kol nuskaityta eilute yra ne NULL
        while(nuskaitytaEilute!= null) {
            System.out.println(nuskaitytaEilute);
            nuskaitytaEilute= bufferedReader.readLine();

        }
        System.out.println("Failo patikrinimas baigtas");
    }
}


