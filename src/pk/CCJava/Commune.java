package pk.CCJava;

public class Commune {

    private String name;
    private int department;
    private int postalCode;
    private int population;
    private int surface;

    // Constructeur vide
    Commune() {
    }

    // Constructeur trivial
    Commune(String name, int department, int postalCode, int population, int surface) {
        this.name = name;
        this.department = department;
        this.postalCode = postalCode;
        this.population = population;
        this.surface = surface;

    }

}
