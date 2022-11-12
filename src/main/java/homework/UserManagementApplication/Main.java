package homework.UserManagementApplication;

import java.io.*;

public class Main {

    public static final String PATH_TO_DATABASE = "src/main/resources/userDatabase.txt";

    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader(PATH_TO_DATABASE);
        BufferedReader bufferedReader = new BufferedReader(filereader);
        ApplicationService applicationService = new ApplicationService();

        int totalUsers = applicationService.getTotalUsers(bufferedReader);
        User[] usersDataBase = new User[totalUsers];
//SUKURIAM FILEREADER2 IR BUFFREADER 2, KADANGI REIKIA SKAITYTI FAILA IS NAUJO,
// KAIP IR PAPRASCCIAUSIAS BUDAS NURESETINT, BET REIKTU KAZKOKIO GERESNIO METODO
        FileReader filereader2 = new FileReader(PATH_TO_DATABASE);
        BufferedReader bufferedReader2 = new BufferedReader(filereader2);
        String lineReaded = bufferedReader2.readLine();


        //DUOMENU FILTRAVIMAS. //Splitinam duomenis, priskiriam name, age, atitinkamom reiksmem,
        // sukuriam nauja objekta- user ir patalpinam ji i userdataBase masyva
        int currentUser = 0;
        while (lineReaded != null && currentUser < totalUsers) { //kol skaitoma linija nera NULL ir  neprasuka pro visus varotojus
            String[] userDataSplit = lineReaded.split(",");
            String name = userDataSplit[0];
            int age = Integer.parseInt(userDataSplit[1]); //is String i int
            int phoneNumber = Integer.parseInt(userDataSplit[2]);
            long personalCode = Long.parseLong(userDataSplit[3]);
            String address = userDataSplit[4];
            User user = new User(name, age, phoneNumber, personalCode, address);
            usersDataBase[currentUser++] = user;
            lineReaded = bufferedReader2.readLine();

        }

        applicationService.printListOfUsers(usersDataBase, filereader2, bufferedReader2);

        applicationService.printUsersOver21YearsOld(usersDataBase, filereader2, bufferedReader2);

        FileReader filereader3 = new FileReader(PATH_TO_DATABASE);
        BufferedReader bufferedReader3 = new BufferedReader(filereader3);
        applicationService.printAllWomensFromTheList(usersDataBase, filereader3, bufferedReader3);

        FileReader filereader4 = new FileReader(PATH_TO_DATABASE);
        BufferedReader bufferedReader4 = new BufferedReader(filereader4);
          applicationService.printUsersNamesStartedAOrB(usersDataBase,filereader4,bufferedReader4);







        //Bonus: Pasidometi kaip irsyti duomenis i faila.
        //Sukurti masyva Device[] ir i ji patalpinti 5 objektus. Tada visus juos irasyti i faila. Viena eilute turi atspindeti viena objekta. Pvz. 1/Nokia/1300/Blue
        Device device1 = new Device("Phone", "Iphone 14", 2022, 1499);
        Device device2 = new Device("Phone", "Samsung s22", 2021, 1200);
        Device device3 = new Device("Tv", "LG NANO75", 2021, 950);
        Device device4 = new Device("Tv", "Sony x90JAEP", 2021, 2000);
        Device device5 = new Device("Earphones", "Buds 3 Pro", 2021, 250.9);

        Device[] devicesList ={device1,device2,device3,device4,device5} ;
        FileWriter myWriter = new FileWriter("devices.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
        bufferedWriter.write(devicesList[0].toString());
        bufferedWriter.newLine();
        bufferedWriter.write(devicesList[1].toString());
        bufferedWriter.newLine();
        bufferedWriter.write(devicesList[2].toString());
        bufferedWriter.newLine();
        bufferedWriter.write(devicesList[3].toString());
        bufferedWriter.newLine();
        bufferedWriter.write(devicesList[4].toString());
        bufferedWriter.close();



    }
}
