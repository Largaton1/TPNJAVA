package pk;

public class ApartmentTest {

    public static void afficheParc(Apartment[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int totalLocataires (Apartment[] tab) {
		int total = 0;
		for (int i=0; i<tab.length ; i++) {
			total = total + tab[i].getNbLocataire();
			
		}
		return total;
	}

    public static void main(String[] args) {

    }
}
