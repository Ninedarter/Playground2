package homework.UserManagementApplication;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ApplicationService {


    public void printListOfUsers(User[] user, FileReader fileReader, BufferedReader bufferedReader) throws IOException {
        System.out.println("List of users : ");
        int currentUser = 0;
        while (currentUser < user.length) {
            System.out.println(Arrays.toString(new String[]{user[currentUser].name}));
            currentUser++;
            String lineReaded = bufferedReader.readLine();
        }
    }
    public void printUsersOver21YearsOld(User[] user, FileReader fileReader, BufferedReader bufferedReader) {
        ArrayList<String> usersOver21 = new ArrayList<>();
        int currentUser = 0;
        for (User everyUser : user) {
            if (user[currentUser].age > 21) {
                usersOver21.add(user[currentUser].name);
                currentUser++;
            } else {
                currentUser++;
            }
        }


        System.out.println("Users over 21 years old : ");
        System.out.println(usersOver21);


    }


    public void printUsersNamesStartedAOrB(User[] user, FileReader fileReader, BufferedReader bufferedReader) {
        ArrayList<String> usersNameStartingAOrB = new ArrayList<>();
        int currentUser = 0;
        for (User everyUser : user) {


            if (userNameStartsWithAorB(user[currentUser])) {
                usersNameStartingAOrB.add(user[currentUser].name);
                currentUser++;

            } else {
                currentUser++;
            }
        }

        System.out.println("Users which names starting with A or B list : ");
        System.out.println(usersNameStartingAOrB);


    }

    public void printAllWomensFromTheList(User[] user, FileReader fileReader, BufferedReader bufferedReader) {
        ArrayList<String> femalesList = new ArrayList<String>();
        int currentUser = 0;
        for (User everyUser : user) {
            char[] personalId = Long.toString(user[currentUser].personalCode).toCharArray();
            if (personalId[0] % 2 == 0) {
                femalesList.add(user[currentUser].name);
                currentUser++;
            } else {
                currentUser++;
            }
        }
        System.out.println("List of  womens : ");
        System.out.println(femalesList);
    }


    public int getTotalUsers(BufferedReader bufferedReader) throws IOException {
        int totalUsers = 0;
        String lineReaded = bufferedReader.readLine();
        while (lineReaded != null) {
            totalUsers++;
            lineReaded = bufferedReader.readLine();
        }
        return totalUsers;
    }

    private  boolean userNameStartsWithAorB(User user) {
        return user.name.startsWith("A") || user.name.startsWith("B");
    }

    public void addDevicesToTxt() throws IOException {

        System.out.println("Enter how many devices you want to add : ");
        Scanner sc = new Scanner(System.in);
        int devicesToAdd = sc.nextInt();
        Device[] devicesList = new Device[devicesToAdd];
        int currentDevice = 0;
        while (currentDevice < devicesToAdd) {
            System.out.println("Enter type of device");
            String type = sc.next();
            System.out.println("Enter model of device");
            String model = sc.next();
            System.out.println("Enter  years of made");
            int yearsMade = sc.nextInt();
            System.out.println("Enter price : ");
            double price = sc.nextDouble();

            Device device = new Device(type, model, yearsMade, price);
            devicesList[currentDevice] = device;
            FileWriter myWriter = new FileWriter("devices2.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
            bufferedWriter.write(devicesList[currentDevice].model);
            bufferedWriter.newLine();
            currentDevice++;
        }
        System.out.println(Arrays.toString(devicesList));


    }


}

