package pk.CCJava;

public class Commune {

    private String name;
    private int department;
    private int postalCode;
    private int population;
    private int superficie;

    // Constructeur vide
    Commune() {
    }

    // Constructeur trivial
    Commune(String name, int department, int postalCode, int population, int superficie) {
        this.name = name;
        this.department = department;
        this.postalCode = postalCode;
        this.population = population;
        this.superficie = superficie;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public String toString() {
        return "name" + name + "department" + "postalCode" + "superficie";
    }
}
