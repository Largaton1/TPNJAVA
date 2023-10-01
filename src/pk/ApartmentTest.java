package pk;

public class ApartmentTest {

    public static void afficheParc(Apartment[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int totalLocataires(Apartment[] tab) {
        int total = 0;
        for (int i = 0; i < tab.length; i++) {
            total = total + tab[i].getNbLocataire();

        }
        return total;
    }

    public static Apartment apptSurfaceMax(Apartment[] tab) {
        double max = 0;
        Apartment apartment = new Apartment();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getSurface() > max) {
                max = tab[i].getSurface();
                apartment = tab[i];

            }
        }
        return apartment;

    }

    public static double surfaceMoyenne(Apartment[] tab) {
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {

            somme = somme + tab[i].getSurface();

        }
        double moyenne = somme / (tab.length);

        return moyenne;

    }

    public static void main(String[] args) {

        Apartment apartment1 = new Apartment("adr1", 1, 9, 3);
        Apartment apartment2 = new Apartment("adr2", 2, 4, 7);
        Apartment apartment3 = new Apartment("adr3", 3, 5, 8);
        Apartment apartment4 = new Apartment("adr4", 4, 6, 9);

        Apartment[] tab = { apartment1, apartment2, apartment3, apartment4 };
        System.out.println(surfaceMoyenne(tab));
    }
}
