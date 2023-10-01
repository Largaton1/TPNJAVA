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

    public int getPopulation() {
        return this.population;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public String toString() {
        return "name" + name + "department" + "postalCode" + "superficie";
    }

    public static Commune morePopulated(Commune commune1, Commune commune2) {

        if (commune1.getPopulation() < commune2.getPopulation()) {

            return commune2;
        }
        return commune1;
    }

    public double density() {
        return (this.population / this.superficie);
    }

    public static Commune leastPopulated(Commune[] array) {

        Commune leastPopulated = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].density() < leastPopulated.density()) {
                leastPopulated = array[i];
            }

        }
        return leastPopulated;
    }

    public static int sameName(Commune[] array, String name) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().equals(name))
                ;
            {
                count++;
            }
        }
        return count;
    }
}
