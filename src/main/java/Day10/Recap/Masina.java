package Day10.Recap;

public class Masina {

    String name;
    boolean isBroken;

    public Masina(String name, boolean isBroken) {
        this.name = name;
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "name='" + name + '\'' +
                ", isBroken=" + isBroken +
                '}';
    }
}
