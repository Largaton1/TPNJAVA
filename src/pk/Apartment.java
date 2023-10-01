package pk;

public class Apartment {

	private String adresse;
	private int numeroEtage;
	private double surface;
	private int nbLocataires;

	// Constructeur vide qui ne fait que créer un nouvel appartement
	Apartment() {
	}

	// Constructeur trivial
	Apartment(String adresse, int numeroEtage, double surface, int nbLocataires) {
		this.adresse = adresse;
		this.numeroEtage = numeroEtage;
		this.surface = surface;
		this.nbLocataires = nbLocataires;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumeroEtage() {
		return this.numeroEtage;
	}

	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}

	public double getSurface() {
		return this.surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public int getNbLocataire() {
		return this.nbLocataires;
	}

	public void setNbLocataires(int nbLocataires) {
		this.nbLocataires = nbLocataires;
	}

	public String toString() {
		return "adresse : " + this.adresse + ",numeroEtage" + this.numeroEtage + ",surface" + this.surface
				+ ",nbLocataire" + this.nbLocataires;

	}

}
