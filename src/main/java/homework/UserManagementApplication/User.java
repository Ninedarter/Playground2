package homework.UserManagementApplication;

public class User {
    String name;
    public int age;
    public int phoneNumber;
    public long personalCode;
    public String address;


    public User(String name, int age, int phoneNumber, long personalCode, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.personalCode = personalCode;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", personalCode=" + personalCode +
                ", address='" + address + '\'' +
                '}';
    }
}
